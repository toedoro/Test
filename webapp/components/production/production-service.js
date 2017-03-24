(function () {
    'use strict';

	angular.module('app').factory('productionService', ['$http', function($http) {
		   
		return {
			getOrders: function(){
				var configuration = {
					headers : {'Accept' : 'application/json'}
				};
				
				var url = "http://127.0.0.1:9002/production/api/orders";
				
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