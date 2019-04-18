//肉猪服务层
app.service("rzglService",function ($http) {

   /* this.findPage=function(page,size){
        return $http.get('./zzzl/findPage?page=' + page + '&size=' + size);
    };*/

    this.selectByEarNum=function (earNumber) {
      return $http.post('../rzgl/selectByEarNum?earNumber='+earNumber);
    };


    this.add=function (entity) {
       return  $http({
           method: 'post',
           url: '../rzgl/add',
           data: $.param(entity),
           headers: {
               'Content-Type': 'application/x-www-form-urlencoded'
           }
       });
    };
    this.selectById = function (entityId) {
        return  $http.get('../rzgl/selectById?id='+entityId);
    };

    this.update=function (entity) {
       return $http({
            method: 'post',
            url: '../rzgl/updateById',
            data: $.param(entity),
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        });
    };
    this.dele=function (selectIds) {
        return  $http.get('../rzgl/delete?ids=' + selectIds);
    };
    this.deleteById=function (id) {
        return $http.get('../rzgl/deleteById?id=' + id);
    };
    this.searchByExample=function (page,size,searchEntity) {
         return $http.post('../rzgl/searchByExample?page=' + page + '&size=' + size,searchEntity);
    };
})