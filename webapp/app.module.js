var app = angular.module('app',[ 'ngRoute' ]);
app.config(function($routeProvider, $locationProvider) {
	$locationProvider.hashPrefix('');
	
    $routeProvider
		.when("/order", {
			templateUrl : "components/order/order.html",
			controller : "orderController",
			title : "Order Service"
		}).when("/production", {
			templateUrl : "components/production/production.html",
			controller : "productionController",
			title : "Production Service"
		});
		
});