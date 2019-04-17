package cn.mrmj.zcgj.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description:
 * @author: 稚生
 * @date: 2019/4/17 16:57
 * @version: V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZzzlPo implements Serializable {
    private Integer id;
    private Integer earNumber;
    private String gender;
    private String state;
    private String isPresent;
    private Integer age;
    private String varieties;
    private String houseNumber;
    private String approachTime;
    private String approachType;
    private String departureType;
}
