(function () {
    'use strict';

	angular.module('app').controller('orderController', orderController);
    
	orderController.$inject = ['$scope', 'orderService'];

	function orderController( $scope, orderService ){
		
		$scope.orders = [];
		$scope.products = [];
		$scope.order = {};
		
		var getProducts = function(){
			orderService.getProducts().then(function( result ){
				$scope.products = result;
			});
		}
		
		$scope.resolve = function( data ){
			return data ? JSON.parse(data) : null;
		}
		
		var getOrders = function(){
			orderService.getOrders().then(function( result ){
				$scope.orders = result;
			});
		}
		
		getProducts();
		getOrders();
		
		$scope.schedule = function(){
			console.log( $scope.order );
			var product = $scope.resolve( $scope.order.product );
			$scope.order.product = {
				id : product.id
			}
			console.log( $scope.order );
			orderService.schedule( $scope.order ).then(function( result ){
				getOrders();
			});
		}
		
	}
	
})();