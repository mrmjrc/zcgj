//生产管理服务层
app.service("bioSafetyService",function ($http) {

   /* this.findPage=function(page,size){
        return $http.get('./zzzl/findPage?page=' + page + '&size=' + size);
    };*/

    this.add=function (entity) {
       return  $http({
           method: 'post',
           url: '../bioSafety/add',
           data: $.param(entity),
           headers: {
               'Content-Type': 'application/x-www-form-urlencoded'
           }
       });
    };
    this.selectById = function (entityId) {
        return  $http.get('../bioSafety/selectById?id='+entityId);
    };

    this.update=function (entity) {
       return $http({
            method: 'post',
            url: '../bioSafety/updateById',
            data: $.param(entity),
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        });
    };
    this.dele=function (selectIds) {
        return  $http.get('../bioSafety/delete?ids=' + selectIds);
    };
    this.deleteById=function (id) {
        return $http.get('../bioSafety/deleteById?id=' + id);
    };
    this.selectByEarNum=function (earNumber) {
        return $http.post('../bioSafety/selectByEarNum?earNumber='+earNumber);
    };
    this.searchByExample=function (page,size,searchEntity) {
         return $http.post('../bioSafety/searchByExample?page=' + page + '&size=' + size,searchEntity);
    };
})