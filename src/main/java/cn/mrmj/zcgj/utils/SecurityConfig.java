package cn.mrmj.zcgj.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;

/**
 * @description: SecurityConfig
 * @author: 源稚生
 * @date: 2019/4/21
 * @version: V1.0
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Resource
    private AuthenticationProvider provider;  //注入我们自己的AuthenticationProvider


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/login.html","/register.html","/css/**",  "/fonts/**", "/images/**", "/js/**", "/lib.layui/**","/lib/layui/**","/lib/**","/layui_exts/**","/register/add","/register/selectUser","/register/sendCode","/register/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login.html")
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/index.html")
                .permitAll()
                .and()
                .logout().logoutUrl("/logout")
                .logoutSuccessUrl("/login.html")
                .invalidateHttpSession(true)
                .and()
                .csrf().disable()
                .headers().frameOptions().sameOrigin();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(provider);
       /* auth.inMemoryAuthentication()
                .passwordEncoder(new BCryptPasswordEncoder())
                .withUser("user")
                .password(new BCryptPasswordEncoder().encode("123456"))
                .roles("USER");*/


    }
}