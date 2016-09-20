angular.module("components")
    .directive("driverPage", [function () {
        return {
            templateUrl: "public/app/templates/questionaire.html",
            restrict: "A,E,C"
        };
}]);