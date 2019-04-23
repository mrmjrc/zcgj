package cn.mrmj.zcgj.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description:
 * @author: 稚生
 * @date: 2019/4/18 11:43
 * @version: V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PorkerPigPo implements Serializable {
    private Integer id;
    private String earNumber;
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
