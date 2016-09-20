(function() {
angular.module('route', ['ngRoute'])
	.config(function($routeProvider){
		$routeProvider
         .when('/', {
				templateUrl: '../../app/templates/start.html'
			})
        
			.when('/start', {
				templateUrl: '../../app/templates/start.html'
			})

			.when('/vehicles', {
				templateUrl: '../../app/templates/login.html'
			})

			.when('/drivers', {
				templateUrl: '../../app/templates/questionaire.html',
                css: '../../css/driverPage.css'
			})
			.when('/final-details', {
				templateUrl: '../../app/templates/driver_questionaire.html'
			})
			.when('/rate', {
				templateUrl: '../../app/templates/register.html'
			})
			  .otherwise({
                redirectTo: '/'
            });

		});
	})();
