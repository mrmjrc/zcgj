package cn.mrmj.zcgj.service;

import cn.mrmj.zcgj.po.UserPo;

/**
 * @description:
 * @author: 稚生
 * @date: 2019/4/20 15:40
 * @version: V1.0
 */
public interface UserService {

    UserPo selectByUsername(String username);

    UserPo selectById(Integer id);

    void updateById(UserPo userPo);

    void modifyPassword(UserPo userPo);

}
