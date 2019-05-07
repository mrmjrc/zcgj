package cn.mrmj.zcgj.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: 源稚生
 * @date: 2019/4/21
 * @version: V1.0
 */
@Controller
public class UserLoginController {

    @RequestMapping("/login")
    public String userLogin() {
        return "login.html";
    }

    @RequestMapping("/loginName")
    @ResponseBody
    public Map name() {
        //从 security 中获取用户名
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        Map<String,String> map = new HashMap();
        map.put("loginName", name);
        return map;
    }

}
