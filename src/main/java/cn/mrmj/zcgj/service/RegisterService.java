package cn.mrmj.zcgj.service;

import cn.mrmj.zcgj.po.UserRegisterPo;
import com.aliyuncs.exceptions.ClientException;

/**
 * @description:
 * @author: 稚生
 * @date: 2019/4/20 15:40
 * @version: V1.0
 */
public interface RegisterService {
    /**
     * 用户注册添加信息
     * @param userRegisterPo
     */
    void add(UserRegisterPo userRegisterPo);

    /**
     * 查询用户名是否存在
     * @param username
     * @return
     */
    UserRegisterPo select(String username);
    /**
     * 用户注册修改信息
     * @param userRegisterPo
     */
    void update(UserRegisterPo userRegisterPo);

    /**
     * 发送短信验证码
     * @param phone
     */
    public void createSmsCode(String phone) throws ClientException;

    /**
     * 检验验证码
     * @param phone
     * @param code
     * @return
     */
    public boolean checkSmsCode(String phone,String code);

}
