angular.module("components")
    .directive("customHeader", [function () {
        return {
            templateUrl: "public/app/templates/navbar.jsp",
            restrict: "A,E,C"
        };
}]);
