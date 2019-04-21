app.controller('userController',function ($scope,userService) {
    $scope.showLoginName=function () {
        loginService.loginName().success(
            function (response) {
           $scope.loginName=response.loginName;
        });
    }
})