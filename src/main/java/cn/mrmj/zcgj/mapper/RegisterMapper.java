package cn.mrmj.zcgj.mapper;


import cn.mrmj.zcgj.po.BioSafetyPo;
import cn.mrmj.zcgj.po.UserRegisterPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
    void addUser(UserRegisterPo userRegisterPo);

    /**
     * 查询用户名是否存在
     * @param username
     */
    UserRegisterPo selectUser(@Param("username") String username);

    /**
     * 用户修改
     * @param userRegisterPo
     */
    void updateUser(UserRegisterPo userRegisterPo);
}
