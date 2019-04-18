package cn.mrmj.zcgj.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:生产管理
 * @author: 稚生
 * @date: 2019/4/18 11:37
 * @version: V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Scgl {
    private Integer id;
    private String earNumber;
    private Integer age;
    private String currentHouseNumber;
    private String parity;
    private String litterSize;
    private String matingTimes;
    private String breedingBoar;
    private Integer abortionNumber;
    private Integer survivalNumber;

}
