//幼猪服务层
app.service("youngPigService",function ($http) {

   /* this.findPage=function(page,size){
        return $http.get('./zzzl/findPage?page=' + page + '&size=' + size);
    };*/

    this.selectByEarNum=function (earNumber) {
      return $http.post('../youngPig/selectByEarNum?earNumber='+earNumber);
    };


    this.selectByMearNum=function (mearNumber) {
      return $http.post('../youngPig/selectByMearNum?mearNumber='+mearNumber);
    };

    this.add=function (entity) {
       return  $http({
           method: 'post',
           url: '../youngPig/add',
           data: $.param(entity),
           headers: {
               'Content-Type': 'application/x-www-form-urlencoded'
           }
       });
    };
    this.selectById = function (entityId) {
        return  $http.get('../youngPig/selectById?id='+entityId);
    };

    this.update=function (entity) {
       return $http({
            method: 'post',
            url: '../youngPig/updateById',
            data: $.param(entity),
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        });
    };
    this.dele=function (selectIds) {
        return  $http.get('../youngPig/delete?ids=' + selectIds);
    };
    this.deleteById=function (id) {
        return $http.get('../youngPig/deleteById?id=' + id);
    };
    this.searchByExample=function (page,size,searchEntity) {
         return $http.post('../youngPig/searchByExample?page=' + page + '&size=' + size,searchEntity);
    };
    
})