(function () {
    'use strict';

	angular.module('app').controller('productionController', productionController);
    
	productionController.$inject = ['$scope', 'productionService'];

	function productionController( $scope, productionService ){
		
		$scope.orders = [];

		var getOrders = function(){
			productionService.getOrders().then(function( result ){
				$scope.orders = result;
				$scope.orders.forEach(function(order){
					
					productionService.getOrderByProductionStartDate( order.productionStartDate ).then(function(result){
						if( result.length > 1 ) 
							order.availability = 'NOT AVAILABLE';
						else
							order.availability = 'AVAILABLE';
					});
				});
			});
		}
		
		getOrders();
		
		$scope.resolve = function( data ){
			return data ? JSON.parse(data) : null;
		}
		
		$scope.schedule = function(){
			var order = $scope.resolve($scope.production.order);
			order.status = 'CONFIRMED';
			if( order.availability != 'AVAILABLE'){
				order.status = 'REJECTED';
			}
			
			var production = {
				orderId : order.id,
				status : order.status
			}
			
			productionService.create( production ).then(function(prodResult){
				productionService.schedule( order ).then(function( orderResult ){
					getOrders();
				});
			});
			
		}
	}
	
})();