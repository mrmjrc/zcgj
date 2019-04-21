//生产管理服务层
app.service("userService",function ($http) {

    this.selectUser=function (username) {
        return $http.get('../user/selectUser?username='+username);
    };

    this.addInfo=function (phone) {
        return $http.get('../user/addInfo?phone='+phone);
    }
    this.modifyPassword=function () {
        return $http.get("../user/modifyPassword?="+$entity.password);
    }

});