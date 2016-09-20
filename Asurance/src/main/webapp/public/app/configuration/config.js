(function () {
    angular.module("autoInsurance")
        .config(["$urlRouterProvider", "$stateProvider", function ($urlRouterProvider, $stateProvider) {
            //configuring the routes
            var loginObj = {
            		url: '/login',
                templateUrl: "public/app/templates/login.jsp"
            };
            var registerObj = {
            		url: '/register',
                templateUrl: "public/app/templates/register.jsp"
            };
            var quoteObj = {
            		url: '/quote',
                templateUrl: "public/app/templates/tabs.jsp",
              
            };
            var vehicleObj = {
            		url: '/vehicles',
                templateUrl: "public/app/templates/vehicle.jsp"
                
            };
            $stateProvider.state("login", loginObj);
            $stateProvider.state("register", registerObj);
            $stateProvider.state("quote", quoteObj);
            $stateProvider.state("vehicles", vehicleObj);
    }]).run(["$state", function ($state) {
            $state.go("quote");
    }])
})();



/*    $stateProvider

    .state('login', {
        url: '#/login',
        templateUrl: 'public/app/templates/login.jsp'
    })
    .state('register', {
        url: '#/register',
        templateUrl: 'public/app/templates/register.jsp'
    })
    .state('quote', {
        url: '#/quote',
        templateUrl: 'public/app/templates/tabs.jsp'
    });


});
  angular.bootstrap(document.getElementById("header"), ['routeProvider']);*/
