package cn.mrmj.zcgj.controller;

import cn.mrmj.zcgj.dto.Result;
import cn.mrmj.zcgj.po.PasswordPo;
import cn.mrmj.zcgj.po.UserPo;
import cn.mrmj.zcgj.service.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @description:
 * @author: 稚生
 * @date: 2019/4/22 10:08
 * @version: V1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/selectUser")
    @ResponseBody
    public UserPo selectUser() {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        return userService.selectByUsername(name);
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public UserPo selectById(Integer id) {
        return userService.selectById(id);
    }

    @RequestMapping("/updateById")
    @ResponseBody
    public Result updateById(UserPo userPo) {
        try {
            userService.updateById(userPo);
            return new Result(true, "更新信息成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "添加信息失败");
        }
    }

    @RequestMapping("/selectPassword")
    @ResponseBody
    public Result selectPassword(String password) {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        UserPo userPo = userService.selectByUsername(name);
        if (DigestUtils.md5DigestAsHex(password.getBytes()).equals(userPo.getPassword())) {
            return new Result(false, "密码正确");
        }else {
            return new Result(true, "旧密码输入错误");
        }
    }

    @RequestMapping("/updatePassword")
    @ResponseBody
    public Result updatePassword(PasswordPo passwordPo) {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        UserPo userPo = userService.selectByUsername(name);
        if (!userPo.getPassword().equals(DigestUtils.md5DigestAsHex(passwordPo.getOldPassword().getBytes()))) {
            return new Result(false, "密码修改失败");
        }
        try {
            userPo.setPassword(DigestUtils.md5DigestAsHex(passwordPo.getPassword().getBytes()));
            userService.modifyPassword(userPo);
            return new Result(true, "密码修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "密码修改失败");
        }
    }




}
