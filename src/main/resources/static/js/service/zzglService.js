//猪只资料服务层
app.service("zzglService",function ($http) {

   /* this.findPage=function(page,size){
        return $http.get('./zzzl/findPage?page=' + page + '&size=' + size);
    };*/

    this.selectByEarNum=function (earNumber) {
      return $http.post('../zzgl/selectByEarNum?earNumber='+earNumber);
    };
    this.add=function (entity) {
       return  $http({
           method: 'post',
           url: '../zzgl/add',
           data: $.param(entity),
           headers: {
               'Content-Type': 'application/x-www-form-urlencoded'
           }
       });
    };
    this.selectById = function (entityId) {
        return  $http.get('../zzgl/selectById?id='+entityId);
    };

    this.update=function (entity) {
       return $http({
            method: 'post',
            url: '../zzgl/updateById',
            data: $.param(entity),
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        });
    };
    this.dele=function (selectIds) {
        return  $http.get('../zzgl/delete?ids=' + selectIds);
    };
    this.deleteById=function (id) {
        return $http.get('../zzgl/deleteById?id=' + id);
    };
    this.searchByExample=function (page,size,searchEntity) {
         return $http.post('../zzgl/searchByExample?page=' + page + '&size=' + size,searchEntity);
    };
    
})