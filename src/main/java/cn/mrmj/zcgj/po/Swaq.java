package cn.mrmj.zcgj.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 生物安全po
 * @author: 稚生
 * @date: 2019/4/18 11:34
 * @version: V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Swaq {
    private Integer id;
    private String earNumber;
    private String physicalExamination;
    private String immuneStatus;
    private String vaccinationType;
    private String disinfectionSituation;
    private String diseaseCondition;
}
