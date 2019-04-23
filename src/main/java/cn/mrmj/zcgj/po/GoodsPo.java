package cn.mrmj.zcgj.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description: 物品po
 * @author: 稚生
 * @date: 2019/4/18 11:28
 * @version: V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsPo implements Serializable {
    private Integer id;
    private String recordingTime;
    private String type;
    private String name;
    private String unit;
    private String supplier;
    private String number;
    private String unitPrice;
    private String actualExpenditure;
    private String remarks;
}
