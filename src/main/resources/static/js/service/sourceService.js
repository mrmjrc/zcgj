//溯源管理
app.service("sourceService",function ($http) {


    this.selectByEarNum=function (earNumber) {
      return $http.post('../youngPig/selectByEarNum?earNumber='+earNumber);
    };

    this.selectByNumber=function (earNumber) {
        return $http.post('../youngPig/selectByNumber?earNumber='+earNumber);
    };


    this.selectByBearNum=function (earNumber) {
        return $http.post('../breedingPig/selectByEarNum?earNumber='+earNumber);
    };

    this.selectYoungByBearNum=function (bearNumber) {
      return $http.post('../youngPig/selectYoungByBearNum?earNumber='+bearNumber);
    };

    this.selectBreeding=function (earNumber) {
        return $http.post('../breedingPig/selectBreeding?earNumber='+earNumber);
    };



});