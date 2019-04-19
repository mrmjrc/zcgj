//肉猪服务层
app.service("porkerPigService",function ($http) {

   /* this.findPage=function(page,size){
        return $http.get('./zzzl/findPage?page=' + page + '&size=' + size);
    };*/

    this.selectByEarNum=function (earNumber) {
      return $http.post('../porkerPig/selectByEarNum?earNumber='+earNumber);
    };


    this.add=function (entity) {
       return  $http({
           method: 'post',
           url: '../porkerPig/add',
           data: $.param(entity),
           headers: {
               'Content-Type': 'application/x-www-form-urlencoded'
           }
       });
    };
    this.selectById = function (entityId) {
        return  $http.get('../porkerPig/selectById?id='+entityId);
    };

    this.update=function (entity) {
       return $http({
            method: 'post',
            url: '../porkerPig/updateById',
            data: $.param(entity),
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        });
    };
    this.dele=function (selectIds) {
        return  $http.get('../porkerPig/delete?ids=' + selectIds);
    };
    this.deleteById=function (id) {
        return $http.get('../porkerPig/deleteById?id=' + id);
    };
    this.searchByExample=function (page,size,searchEntity) {
         return $http.post('../porkerPig/searchByExample?page=' + page + '&size=' + size,searchEntity);
    };
})