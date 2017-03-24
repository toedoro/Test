(function () {
    'use strict';

	angular.module('app').factory('orderService', ['$http', function($http) {
		   
		var url = "http://127.0.0.1:9002/order/api";
		return {
			schedule: function( order ){
				var productionStartDate = new Date(order.productionStartDate);
				
				order.productionStartDate = productionStartDate;
				return $http.post(url, order);
			}, getOrders: function(){
				var configuration = {
					headers : {'Accept' : 'application/json'}
				};
				
				
				return $http.get( 
					url, configuration
				).then(function(response){
					return response.data;
				}, function(response){
					return [];
				});
				
			}, getProducts: function(){
				var configuration = {
					headers : {'Accept' : 'application/json'}
				};
				
				var url = "http://127.0.0.1:9002/order/product/api";
				
				return $http.get( 
					url, configuration
				).then(function(response){
					return response.data;
				}, function(response){
					return [];
				});
				
			}
		}
	}]);

})();