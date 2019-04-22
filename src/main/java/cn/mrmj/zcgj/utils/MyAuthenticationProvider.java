package cn.mrmj.zcgj.utils;

import cn.mrmj.zcgj.dto.UserInfo;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @description:
 * @author: 源稚生
 * @date: 2019/4/21
 * @version: V1.0
 */
@Component
public class MyAuthenticationProvider implements AuthenticationProvider {
        /**
         * 注入我们自己定义的用户信息获取对象
         */
        @Resource
        private UserDetailsService userDetailService;

        @Override
        public Authentication authenticate(Authentication authentication) throws AuthenticationException {
            // TODO Auto-generated method stub
            String userName = authentication.getName();// 这个获取表单输入中返回的用户名;
            //System.out.println("用户名： "+userName);
            String password = (String) authentication.getCredentials();// 这个是表单中输入的密码；
           // System.out.println("密码： "+password);
            // 这里构建来判断用户是否存在和密码是否正确
            UserInfo userInfo = (UserInfo) userDetailService.loadUserByUsername(userName); // 这里调用我们的自己写的获取用户的方法；
            if (userInfo == null) {
                throw new BadCredentialsException("用户名不存在");
            }
           /* System.out.println("现在输入加密： "+new BCryptPasswordEncoder().encode(password));
            System.out.println("数据库中信息"+userInfo.getPassword());*/
            //System.out.println(DigestUtils.md5DigestAsHex(password.getBytes()));
            if (!userInfo.getPassword().equals( DigestUtils.md5DigestAsHex(password.getBytes()))) {
                throw new BadCredentialsException("密码不正确");
            }
            Collection<? extends GrantedAuthority> authorities = userInfo.getAuthorities();
            // 构建返回的用户登录成功的token
            return new UsernamePasswordAuthenticationToken(userInfo, password, authorities);
        }

        @Override
        public boolean supports(Class<?> authentication) {
            // TODO Auto-generated method stub
            // 这里直接改成retrun true;表示是支持这个执行
            return true;
        }

}
