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
		
		var getOrders = function(){
			orderService.getOrders().then(function( result ){
				$scope.orders = result;
			});
		}
		
		getOrders();
		
		$scope.schedule = function(){
			orderService.schedule( $scope.order ).then(function( result ){
				
				getOrders();
			});
		}
		
	}
	
})();