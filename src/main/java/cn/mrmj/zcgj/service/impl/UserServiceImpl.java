package cn.mrmj.zcgj.service.impl;

import cn.mrmj.zcgj.mapper.RegisterMapper;
import cn.mrmj.zcgj.mapper.UserMapper;
import cn.mrmj.zcgj.po.UserPo;
import cn.mrmj.zcgj.service.RegisterService;
import cn.mrmj.zcgj.service.UserService;
import cn.mrmj.zcgj.utils.SmsUtil;
import com.alibaba.fastjson.JSON;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.InitBinder;

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
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserPo selectByUsername(String username) {
        return  userMapper.selectByUsername(username);
    }

    @Override
    public UserPo selectById(Integer id) {
        return userMapper.selectById(id);

    }

    @Override
    @InitBinder
    public void updateById(UserPo userPo) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        userPo.setModifyTime(dateFormat.format(new Date()));
        userMapper.updateById(userPo);
    }

    @Override
    public void modifyPassword(UserPo userPo) {
        userMapper.modifyPassword(userPo);
    }
}
