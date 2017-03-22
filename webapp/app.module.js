var app = angular.module('app',[ 'ngRoute' ]);
app.config(function($routeProvider) {
    $routeProvider
		.when("/order", {
			templateUrl : "components/order/order.html"
		}).when("/production", {
			templateUrl : "components/production/production.html"
		});
});