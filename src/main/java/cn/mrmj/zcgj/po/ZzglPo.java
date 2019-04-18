package cn.mrmj.zcgj.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description: 种猪po
 * @author: 稚生
 * @date: 2019/4/17 16:57
 * @version: V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZzglPo implements Serializable {
    private Integer id;
    private String earNumber;
    private String gender;
    private String isPresent;
    private Integer age;
    private String varieties;
    private String productionSituation;
    private String isTransfer;
    private String currentHouseNumber;
    private String beforeHouseNumber;
    private String approachWeight;
    private String approachTime;
    private String approachType;
    private String leavingTime;
    private String departureType;
}
