package cn.mrmj.zcgj.service.impl;

import cn.mrmj.zcgj.mapper.RegisterMapper;
import cn.mrmj.zcgj.po.UserPo;
import cn.mrmj.zcgj.service.RegisterService;
import cn.mrmj.zcgj.utils.SmsUtil;
import com.alibaba.fastjson.JSON;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: 稚生
 * @date: 2019/4/20 15:42
 * @version: V1.0
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    @Resource
    private RegisterMapper registerMapper;

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private SmsUtil smsUtil;

    @Value("${template_code}")
    private String template_code;

    @Value("${sign_name}")
    private String sign_name;



    @Override
    public void add(UserPo userRegisterPo) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        userRegisterPo.setCreateTime(dateFormat.format(new Date()));
        userRegisterPo.setModifyTime(dateFormat.format(new Date()));
        String password = DigestUtils.md5DigestAsHex(userRegisterPo.getPassword().getBytes());
        userRegisterPo.setPassword(password);
        registerMapper.addUser(userRegisterPo);
    }

    @Override
    public UserPo select(String username) {
        return registerMapper.selectUser(username);
    }


    @Override
    public void createSmsCode(String phone) throws ClientException {
        //生成一个6位随机数
        String smsCode = (long) (Math.random() * 1000000) + "";
        //将验证码放入redis
        redisTemplate.boundHashOps("smsCode").put(phone,smsCode );
        Map map = new HashMap();
        map.put("code", smsCode);
        SendSmsResponse response = smsUtil.sendSms(phone,template_code,sign_name, JSON.toJSONString(map));

        System.out.println("Code=" + response.getCode());
        System.out.println("Message=" + response.getMessage());
        System.out.println("RequestId=" + response.getRequestId());
        System.out.println("BizId=" + response.getBizId());

        //System.out.println(redisTemplate.boundHashOps("smsCode").get(phone));

    }

    @Override
    public boolean checkSmsCode(String phone, String code) {
        String redisCode = (String) redisTemplate.boundHashOps("smsCode").get(phone);
        if (redisCode == null) {
            return false;
        }
        if (!code.equals(redisCode)) {
            return false;
        }
        return true;
    }
}
