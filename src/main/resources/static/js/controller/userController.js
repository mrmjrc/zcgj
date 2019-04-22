app.controller('userController',function ($scope,userService) {

    //user.html

    $scope.selectByUsername = function () {
        userService.selectUserByName().success(
            function (response) {
                $scope.entity=response;
                //alert($scope.entity.id);
            });
    };


    $scope.selectUser=function (username) {
        userService.selectUser(username).success(
            function (response) {
                if (response.result){
                    alert(response.message);
                }
            });
    };

    // 编辑跳转
    $scope.jumpById=function (id) {
        x_admin_show('完善个人信息','user_edit.html',localStorage.setItem("entityId",id));
    };


    //user_edit.html
    //通过id查询
    $scope.selectById=function () {
        var entityId = localStorage.getItem("entityId");
        userService.selectById(entityId).success(
            function (response) {
                $scope.entity = response;
            });
    };

    $scope.updateUser = function () {
        userService.update($scope.entity).success(
            function (response) {
                alert(response.message);
            }
        )
    };

    $scope.selectPassword = function (oldPassword) {
        userService.selectPassword(oldPassword).success(
            function (response) {
                if (response.result){
                    alert(response.message);
                }
            }
        )
    };


    $scope.updatePassword = function () {
        if($scope.entity.password != $scope.entity.password1){
            alert("两次输入密码不一致，重新输入");
            $scope.entity.password = "";
            $scope.entity.password1 = "";
            return;
        }
        userService.updatePassword($scope.entity).success(
            function (response) {
                alert(response.message);
            }
        )
    };




});