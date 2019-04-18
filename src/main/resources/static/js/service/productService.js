//生产管理服务层
app.service("productService",function ($http) {

   /* this.findPage=function(page,size){
        return $http.get('./zzzl/findPage?page=' + page + '&size=' + size);
    };*/

    this.selectByEarNum=function (earNumber) {
      return $http.post('../product/selectByEarNum?earNumber='+earNumber);
    };


    this.add=function (entity) {
       return  $http({
           method: 'post',
           url: '../product/add',
           data: $.param(entity),
           headers: {
               'Content-Type': 'application/x-www-form-urlencoded'
           }
       });
    };
    this.selectById = function (entityId) {
        return  $http.get('../product/selectById?id='+entityId);
    };

    this.update=function (entity) {
       return $http({
            method: 'post',
            url: '../product/updateById',
            data: $.param(entity),
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        });
    };
    this.dele=function (selectIds) {
        return  $http.get('../product/delete?ids=' + selectIds);
    };
    this.deleteById=function (id) {
        return $http.get('../product/deleteById?id=' + id);
    };
    this.searchByExample=function (page,size,searchEntity) {
         return $http.post('../product/searchByExample?page=' + page + '&size=' + size,searchEntity);
    };
})