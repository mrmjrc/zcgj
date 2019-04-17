//猪只资料控制层
app.controller("zzzlController",function ($scope,$controller,zzzlService) {
    $controller('baseController',{$scope:$scope});

    //分页
 /*   $scope.findPage=function(page,size) {
      zzzlService.findPage(page,size).success(
            function (response) {
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;//更新总记录数
            });
    };*/
    $scope.jumpById=function (id) {
        x_admin_show('编辑','zzzl-edit.html',localStorage.setItem("entityId",id));
    };

    //批量删除
    $scope.dele=function(){
        //获取选中的复选框
        var isDelete = confirm("确定删除？"); //layer.confirm("确定删除？");
        if (isDelete) {
            zzzlService.dele($scope.selectIds).success(
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
            zzzlService.deleteById(id).success(
                function (response) {
                    if (response.result){
                        $scope.reloadList();   //刷新列表
                    }
                });
        }
    };

    //条件查询
    $scope.searchEntity={};
    $scope.searchByExample=function(page,size) {
        zzzlService.searchByExample(page,size,$scope.searchEntity).success(
            function (response) {
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;//更新总记录数
            });
    };

    $scope.selectByEarNum=function (earNumber) {
        zzzlService.selectByEarNum(earNumber).success(
            function (response) {
                if (response.result){
                    alert("该耳号已存在");
                }
        });
    };

    $scope.add=function () {
        zzzlService.add($scope.entity).success(
            function (response) {
            alert(response.message);
            $scope.reloadList();
        });
    };

    $scope.selectById=function () {
        var entityId = localStorage.getItem("entityId");
        zzzlService.selectById(entityId).success(
            function (response) {
                $scope.entity = response;
            });
    };
    $scope.updateById=function () {
        alert("update");
        zzzlService.update($scope.entity).success(
            function (response) {
                alert(response.message);
                $scope.reloadList();
            });
    }
});