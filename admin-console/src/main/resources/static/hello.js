/*angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://in2npdceapp02:8080/nifi-api/processors/f4dafabb-015f-1000-a876-c5ed1350728a').
        then(function(response) {
            $scope.greeting = response.data;
        });
});*/

var demo = angular.module('demo', ['ngRoute']);

// configure our routes
demo.config(function($routeProvider) {
    $routeProvider

        // route for the GenrateTO page
        .when('/', {
            templateUrl : '/index.html',
            controller  : 'Hello'
        })
        
         .when('/#!GenrateTO', {
            templateUrl : '/GenrateTO.html',
            controller  : 'genrateTO'
        })
});

demo.controller('genrateTO', function($scope) {
    $scope.message = 'Look! I am on GenrateTO page.';
});

demo.controller('Hello', function($scope, $http) {
    $http.get('http://in2npdceapp02:8080/nifi-api/processors/f4dafabb-015f-1000-a876-c5ed1350728a').
        then(function(response) {
            $scope.greeting = response.data;
        });
});