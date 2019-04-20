package cn.mrmj.zcgj.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: 稚生
 * @date: 2019/4/20 15:31
 * @version: V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterPo implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private Date createTime;
    private Date modifyTime;

}
