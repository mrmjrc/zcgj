//种猪服务层
app.service("breedingPigService",function ($http) {

   /* this.findPage=function(page,size){
        return $http.get('./breedingPig/findPage?page=' + page + '&size=' + size);
    };*/

    this.selectByEarNum=function (earNumber) {
      return $http.post('../breedingPig/selectByEarNum?earNumber='+earNumber);
    };
    this.add=function (entity) {
       return  $http({
           method: 'post',
           url: '../breedingPig/add',
           data: $.param(entity),
           headers: {
               'Content-Type': 'application/x-www-form-urlencoded'
           }
       });
    };
    this.selectById = function (entityId) {
        return  $http.get('../breedingPig/selectById?id='+entityId);
    };

    this.update=function (entity) {
       return $http({
            method: 'post',
            url: '../breedingPig/updateById',
            data: $.param(entity),
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        });
    };
    this.dele=function (selectIds) {
        return  $http.get('../breedingPig/delete?ids=' + selectIds);
    };
    this.deleteById=function (id) {
        return $http.get('../breedingPig/deleteById?id=' + id);
    };
    this.searchByExample=function (page,size,searchEntity) {
         return $http.post('../breedingPig/searchByExample?page=' + page + '&size=' + size,searchEntity);
    };
    
})