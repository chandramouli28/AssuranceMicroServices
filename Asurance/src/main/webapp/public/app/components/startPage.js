angular.module("components")
    .directive("startPage", [function () {
        return {
            templateUrl: "public/app/templates/start.jsp",
            restrict: "A,E,C"
        };
      
}]);

 