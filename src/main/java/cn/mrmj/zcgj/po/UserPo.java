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
public class UserPo implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String gender;
    private String phone;
    private String email;
    private String location;
    private String createTime;
    private String modifyTime;

}
