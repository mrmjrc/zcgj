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
public interface UserMapper {
    /**
     * 根据登录后的用户名查询信息
     * @param username
     * @return
     */
    UserPo selectByUsername(@Param("username") String username);

    /**
     * 跳转页面时的id进行查询
     * @param id
     * @return
     */
    UserPo selectById(@Param("id") Integer id);

    /**
     * 根据id进行信息的更新
     * @param userPo
     */
    void updateById(UserPo userPo);
    /**
     * 密码修改
     * @param userPo
     */
    void modifyPassword(UserPo userPo);
}
