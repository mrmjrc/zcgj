package cn.mrmj.zcgj.mapper;


import cn.mrmj.zcgj.po.UserPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @description: bio_safety mapper
 * @author: 稚生
 * @date: 2019/4/12 15:14
 * @version: V1.0
 */
@Mapper
public interface RegisterMapper {
    /**
     * 用户注册添加
     * @param userRegisterPo
     */
    void addUser(UserPo userRegisterPo);

    /**
     * 查询用户名是否存在
     * @param username
     */
    UserPo selectUser(@Param("username") String username);

}
