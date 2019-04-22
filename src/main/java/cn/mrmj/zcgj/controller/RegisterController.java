package cn.mrmj.zcgj.controller;

import cn.mrmj.zcgj.dto.Result;
import cn.mrmj.zcgj.po.UserPo;
import cn.mrmj.zcgj.service.RegisterService;
import cn.mrmj.zcgj.utils.PhoneFormatCheckUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @description:
 * @author: 稚生
 * @date: 2019/4/20 15:39
 * @version: V1.0
 */
@Controller
@RequestMapping("/register")
public class RegisterController {

    @Resource
    private RegisterService registerService;

    @RequestMapping("/add")
    @ResponseBody
    public Result addUser(UserPo userRegisterPo, String smsCode) {
       // System.out.println(smsCode);
        boolean b = registerService.checkSmsCode(userRegisterPo.getPhone(), smsCode);
        if (!b) {
            return new Result(false, "验证码有误");
        }
        try {
            if (null != registerService.select(userRegisterPo.getUsername())) {
                return new Result(false, "注册失败");
            }else {
                registerService.add(userRegisterPo);
                return new Result(true, "注册成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "注册失败");
        }
    }

    @RequestMapping("/selectUser")
    @ResponseBody
    public Result selectUser(String username) {
        try {
            if (null != registerService.select(username)) {
                return new Result(true, "该用户名已存在");
            }else {
                return new Result(false, "可以注册");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "查询出错");
        }
    }
    @RequestMapping("/sendCode")
    @ResponseBody
    public Result sendCode(String phone) {
        if(!PhoneFormatCheckUtils.isPhoneLegal(phone)){
            return new Result(false, "手机号格式不正确");
        }
        try {
            registerService.createSmsCode(phone);
            return new Result(true, "验证码发送成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "验证码发送失败");
        }
    }


}
