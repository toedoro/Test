(function () {
    'use strict';

	angular.module('app').controller('orderController', orderController);
    
	orderController.$inject = ['$scope', 'orderService'];

	function orderController( $scope, orderService ){
		
		$scope.orders = [];
		
		var getOrders = function(){
			orderService.getOrders().then(function( result ){
				$scope.orders = result;
			});
		}
		
		getOrders();
	
	}
	
})();