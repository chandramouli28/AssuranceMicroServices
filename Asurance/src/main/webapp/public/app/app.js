(function () {
    "use strict";
    angular.module("autoInsurance")
        .controller("mainCtrl", ["$scope", "$rootScope", function ($scope, $rootScope) {
            var baseUrl = "public/app/templates/";
            $scope.templates = {
                navbarUrl: baseUrl + "navbar.jsp",
                footerUrl: baseUrl + "footer.jsp",
                registerUrl: baseUrl + "register.jsp",
                loginUrl: baseUrl + "login.jsp",
                tabsUrl: baseUrl + "tabs.jsp",
                policyUrl: baseUrl + "policyNumber.jsp"
            };

        
     }]);
})();
