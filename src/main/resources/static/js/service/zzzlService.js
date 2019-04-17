//猪只资料服务层
app.service("zzzlService",function ($http) {

   /* this.findPage=function(page,size){
        return $http.get('./zzzl/findPage?page=' + page + '&size=' + size);
    };*/

    this.selectByEarNum=function (earNumber) {
      return $http.post('../zzzl/selectByEarNum?earNumber='+earNumber);
    };
    this.add=function (entity) {
       return  $http({
           method: 'post',
           url: '../zzzl/add',
           data: $.param(entity),
           headers: {
               'Content-Type': 'application/x-www-form-urlencoded'
           }
       });
    };
    this.selectById = function (entityId) {
        return  $http.get('../zzzl/selectById?id='+entityId);
    };

    this.update=function (entity) {
       return $http({
            method: 'post',
            url: '../zzzl/updateById',
            data: $.param(entity),
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        });
    };
    this.dele=function (selectIds) {
        return  $http.get('../zzzl/delete?ids=' + selectIds);
    };
    this.deleteById=function (id) {
        return $http.get('../zzzl/deleteById?id=' + id);
    };
    this.searchByExample=function (page,size,searchEntity) {
         return $http.post('../zzzl/searchByExample?page=' + page + '&size=' + size,searchEntity);
    };
    
})