//生产管理服务层
app.service("userService",function ($http) {


    this.selectUserByName=function () {
        return $http.get('../user/selectUser');
    };

    this.selectById = function (entityId) {
        return  $http.get('../user/selectById?id='+entityId);
    };

    this.selectUser=function (username) {
        return $http.get('../register/selectUser?username='+username);
    };

    this.update=function (entity) {
        return $http({
            method: 'post',
            url: '../user/updateById',
            data: $.param(entity),
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        });
    };

    this.selectPassword=function (password) {
        return $http.get("../user/selectPassword?password="+password);
    }

    this.updatePassword=function (entity) {
        return $http({
            method: 'post',
            url: '../user/updatePassword',
            data: $.param(entity),
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        });
    };

});