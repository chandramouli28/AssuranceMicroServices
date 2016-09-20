(
    function () {
        angular.module("components", []);
        /*angular.module("routeProvider", []);*/
        //build module dependency
        angular.module("autoInsurance", ["components","ui.router"]);
    }
)();
