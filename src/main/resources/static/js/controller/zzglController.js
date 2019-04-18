//猪只资料控制层
app.controller("zzglController",function ($scope,$controller,zzglService) {
    $controller('baseController',{$scope:$scope});


 /*   $scope.findPage=function(page,size) {
      zzzlService.findPage(page,size).success(
            function (response) {
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;//更新总记录数
            });
    };*/

 // 编辑跳转
    $scope.jumpById=function (id) {
        x_admin_show('编辑','zzgl-edit.html',localStorage.setItem("entityId",id));
    };

    //批量删除
    $scope.dele=function(){
        //获取选中的复选框
        var isDelete = confirm("确定删除？"); //layer.confirm("确定删除？");
        if (isDelete) {
            zzglService.dele($scope.selectIds).success(
                function (response) {
                    if (response.result) {
                        $scope.reloadList();//刷新列表
                    } else {
                        alert(response.message);
                    }
                });
        }
    };

    $scope.deleteById=function (id) {
        var isDelete = confirm("确定删除？"); //layer.confirm("确定删除？");
        if (isDelete){
            zzglService.deleteById(id).success(
                function (response) {
                    if (response.result){
                        $scope.reloadList();   //刷新列表
                    }
                });
        }
    };

    //条件分页查询
    $scope.searchEntity={};
    $scope.searchByExample=function(page,size) {
        zzglService.searchByExample(page,size,$scope.searchEntity).success(
            function (response) {
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;//更新总记录数
            });
    };

    $scope.selectByEarNum=function (earNumber) {
        zzglService.selectByEarNum(earNumber).success(
            function (response) {
                if (response.result){
                    alert("该耳号已存在");
                }
        });
    };

    $scope.add=function () {
        zzglService.add($scope.entity).success(
            function (response) {
            alert(response.message);
            //添加完成后刷新列表
            $scope.reloadList();
        });
    };

    $scope.selectById=function () {
        var entityId = localStorage.getItem("entityId");
        zzglService.selectById(entityId).success(
            function (response) {
                $scope.entity = response;
            });
    };
    $scope.updateById=function () {
        zzglService.update($scope.entity).success(
            function (response) {
                alert(response.message);
                $scope.reloadList();
            });
    }
});