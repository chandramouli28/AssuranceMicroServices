angular.module("components")
    .controller('stateController', function($scope, $http){
    	$http.get('public/app/data/usState.json').then(function(res){
    		$scope.addState = res.data;
    	});
    });
