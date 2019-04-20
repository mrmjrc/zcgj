app.controller('registerController',function ($scope,registerService) {

    $scope.reg = function () {
        if($scope.password != $scope.entity.password){
            alert("两次输入密码不一致，重新输入")
            $scope.entity.password = "";
            $scope.password = "";
            return;
        }
        registerService.reg($scope.entity,$scope.smsCode).success(
            function (response) {
                if (response.result) {
                    alert(response.message);
                }else {
                    alert(response.message);
                }
            }
        )
    };

    $scope.selectUser=function (username) {
        registerService.selectUser(username).success(
            function (response) {
                if (response.result){
                    alert(response.message);
                }
            });
    };
    
    $scope.sendCode=function () {
        if ($scope.entity.phone == null || $scope.entity.phone == '') {
            alert("手机号不能够为空");
            return;
        }
        registerService.sendCode($scope.entity.phone).success(
            function (response) {
                alert(response.message);
            }
        );
    }

});