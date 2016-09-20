
angular.module("components")
    .directive("customLogo", [function () {
        return {
            templateUrl: "public/app/templates/customLogo.html",
            restrict: "A,E,C"
        };
}]); 

