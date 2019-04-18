//幼猪服务层
app.service("yzglService",function ($http) {

   /* this.findPage=function(page,size){
        return $http.get('./zzzl/findPage?page=' + page + '&size=' + size);
    };*/

    this.selectByEarNum=function (earNumber) {
      return $http.post('../yzgl/selectByEarNum?earNumber='+earNumber);
    };

    this.selectByMearNum=function (mearNumber) {
      return $http.post('../yzgl/selectByMearNum?mearNumber='+mearNumber);
    };

    this.add=function (entity) {
       return  $http({
           method: 'post',
           url: '../yzgl/add',
           data: $.param(entity),
           headers: {
               'Content-Type': 'application/x-www-form-urlencoded'
           }
       });
    };
    this.selectById = function (entityId) {
        return  $http.get('../yzgl/selectById?id='+entityId);
    };

    this.update=function (entity) {
       return $http({
            method: 'post',
            url: '../yzgl/updateById',
            data: $.param(entity),
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        });
    };
    this.dele=function (selectIds) {
        return  $http.get('../yzgl/delete?ids=' + selectIds);
    };
    this.deleteById=function (id) {
        return $http.get('../yzgl/deleteById?id=' + id);
    };
    this.searchByExample=function (page,size,searchEntity) {
         return $http.post('../yzgl/searchByExample?page=' + page + '&size=' + size,searchEntity);
    };
    
})