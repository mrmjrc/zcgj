app.constructor('baseController',function ($scope) {
    //重新加载列表 数据
    $scope.reloadList=function(){
        //切换页码
        $scope.searchByExample( $scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage);

    };
    //分页控件配置
    $scope.paginationConf = {
        currentPage: 1,
        totalItems: 10,
        itemsPerPage: 10,
        perPageOptions: [10, 20, 30, 40, 50],
        onChange: function(){
            $scope.reloadList();//重新加载
        }
    };

    $scope.selectIds=[];//选中的id集合
    //更新复选框
    $scope.updateSelection=function ($event,id) {
        if($event.target.checked){   //如果被选中，添加到数组中
            $scope.selectIds.push(id);
        }else {
            var idx = $scope.selectIds.indexOf(id);  // 查找的位置
            $scope.selectIds.splice(idx, 1);  //1.移出的位置 2.移出的个数
        }
    };

});