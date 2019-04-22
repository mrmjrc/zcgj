package cn.mrmj.zcgj.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: 稚生
 * @date: 2019/4/22 14:00
 * @version: V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasswordPo {
    private String oldPassword;
    private String password;
}
