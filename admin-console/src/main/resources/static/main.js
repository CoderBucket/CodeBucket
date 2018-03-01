
var app = angular.module('admin-console', ['ngRoute']);

// configure our routes
app.config(function($routeProvider) {
    $routeProvider

        // route for the GenrateTO page
        .when('/', {
            templateUrl : '/welcome.html',
            controller  : 'welcome'
        })
        
         .when('/GenrateTO', {
            templateUrl : '/partials/GenrateTO.html',
            controller  : 'genrateTO'
        })
        .when('/schedule-tms-flow', {
            templateUrl : '/partials/schedule-tms-flow.html',
            controller  : 'schedule-tms-flow'
        })
        .when('/schedule-wms-flow', {
            templateUrl : '/partials/schedule-wms-flow.html',
            controller  : 'schedule-wms-flow'
        })
        
});

app.controller('welcome', function($scope) {
    $scope.message = 'Look! I am on welcome page.';
});

app.controller('genrateTO', function($scope) {
    $scope.message = 'Look! I am on GenrateTO page.';
});

app.controller('schedule-tms-flow', function($scope, $http) {
	 $scope.message = 'Look! I am on schedule-tms-flow page.';
});

app.controller('schedule-wms-flow', function($scope, $http) {
	 $scope.message = 'Look! I am on schedule-wms-flow page.';
//   $http.get('http://in2npdceapp02:8080/nifi-api/processors/f4dafabb-015f-1000-a876-c5ed1350728a').
//       then(function(response) {
//           $scope.greeting = response.data;
//       });
	 $http.get('http://localhost:8080/wm/order').then(function(response) {$scope.orders = response.data;},(errorResponse)=>{ console.log("Error"+errorResponse)});
});

