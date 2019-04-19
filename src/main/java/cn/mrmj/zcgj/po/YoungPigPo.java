package cn.mrmj.zcgj.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 幼猪po
 * @author: 稚生
 * @date: 2019/4/18 11:27
 * @version: V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class YoungPigPo {
    private Integer id;
    private String earNumber;
    private String mearNumber;
    private String gender;
    private Integer age;
    private String varieties;
    private String isTransfer;
    private String currentHouseNumber;
    private String beforeHouseNumber;
    private String approachWeight;
    private String approachTime;
    private String approachType;
    private String leavingTime;
    private String departureType;
}
