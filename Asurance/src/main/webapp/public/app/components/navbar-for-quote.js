angular.module("components")
    .directive("navbarHeader", [function () {
        return {
            templateUrl: "public/app/templates/navbar-for-quote.jsp",
            restrict: "A,E"
        };
}]);

