(function () {
    'use strict';

	angular.module('app').controller('productionController', productionController);
    
	productionController.$inject = ['$scope', 'productionService'];

	function productionController( $scope, productionService ){
		
		$scope.orders = [];

		var getOrders = function(){
			productionService.getOrders().then(function( result ){
				$scope.orders = result;
			});
		}
		
		getOrders();	
	}
	
})();