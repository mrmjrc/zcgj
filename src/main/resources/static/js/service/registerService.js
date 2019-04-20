//生产管理服务层
app.service("registerService",function ($http) {
    this.reg=function (entity,smsCode) {
        return  $http({
            method: 'post',
            url: '../register/add?smsCode='+smsCode,
            data: $.param(entity),
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        });
    };

    this.selectUser=function (username) {
        return $http.get('../register/selectUser?username='+username);
    };

    this.sendCode=function (phone) {
        return $http.get('../register/sendCode?phone='+phone);
    }

});