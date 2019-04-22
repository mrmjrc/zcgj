//溯源控制层
app.controller("sourceController",function ($scope,sourceService) {

//幼猪
    $scope.selectByEarNum=function (earNumber) {
        //alert("移出");
        sourceService.selectByEarNum(earNumber).success(
            function (response) {
                if (!response.result){
                    alert("该耳号不存在");
                }
            });
    };

    $scope.selectByNumber=function (earNumber) {
        //alert("查询");
        sourceService.selectByNumber(earNumber).success(
            function (response) {
                $scope.entity = response;
            });
    };

//种猪
    $scope.selectByBearNum=function (bearNumber) {
        //alert("移出");
        sourceService.selectByBearNum(bearNumber).success(
            function (response) {
                if (!response.result){
                    alert("该耳号不存在");
                }else {
                    sourceService.selectYoungByBearNum(bearNumber).success(
                        function (response) {
                            $scope.list = response.rows;
                        }
                    )
                }
            });
    };

    $scope.selectBreeding=function (earNumber) {
        sourceService.selectBreeding(earNumber).success(
            function (response) {
                if (response){
                    $scope.entity = response;
                }
            });
    };

});
