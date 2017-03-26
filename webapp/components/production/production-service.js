(function () {
    'use strict';

	angular.module('app').factory('productionService', ['$http', function($http) {
		   
		var configuration = {
			headers : {'Accept' : 'application/json'}
		};
		return {
			create: function( production ){
				var url = "http://127.0.0.1:9002/production/api";
				return $http.post(url, production);
			}, schedule: function( order ){
				var url = "http://127.0.0.1:9002/production/api/order";
				return $http.put(url, order);
			}, getOrders: function(){
				var url = "http://127.0.0.1:9002/production/api/orders";
				
				return $http.get( 
					url, configuration
				).then(function(response){
					return response.data;
				}, function(response){
					return [];
				});
			}, getOrderByNo: function( orderNo ){
				var url = "http://127.0.0.1:9002/production/api/order/orderNo/" + orderNo;
				
				return $http.get( 
					url, configuration
				).then(function(response){
					return response.data;
				}, function(response){
					return [];
				});
			}, getOrderByProductionStartDate: function( productionStartDate ){
				var url = "http://127.0.0.1:9002/production/api/order/productionStartDate/" + productionStartDate;
				
				return $http.get( 
					url, configuration
				).then(function(response){
					return response.data;
				}, function(response){
					return [];
				});
			},
		}
	}]);

})();