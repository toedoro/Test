var app = angular.module('app',[ 'ngRoute' ]);
app.config(function($routeProvider) {
    $routeProvider
		.when("/order", {
			templateUrl : "order.htm"
		}).when("/production", {
			templateUrl : "production.htm"
		});
});