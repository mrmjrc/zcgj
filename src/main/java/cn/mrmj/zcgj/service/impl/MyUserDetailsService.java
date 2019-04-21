package cn.mrmj.zcgj.service.impl;

import cn.mrmj.zcgj.dto.UserInfo;
import cn.mrmj.zcgj.po.UserRegisterPo;
import cn.mrmj.zcgj.service.RegisterService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * @description:
 * @author: 源稚生
 * @date: 2019/4/21
 * @version: V1.0
 */
@Component
class MyUserDetailsService implements UserDetailsService {

    @Resource
    private RegisterService registerService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        UserRegisterPo select = registerService.select(username);
        //这里可以可以通过username（登录时输入的用户名）然后到数据库中找到对应的用户信息，并构建成我们自己的UserInfo来返回。
        //这里可以通过数据库来查找到实际的用户信息
        if (null == select) {
            System.out.println("未查询出用户信息");
            return null;
        }else if (username.equals(select.getUsername())) {
            UserInfo userInfo = new UserInfo(select.getUsername(), select.getPassword(), "ROLE_ADMIN", true, true, true, true);
            return userInfo;
        }
            return null;
        }
    }
// TODO Auto-generated method stub


