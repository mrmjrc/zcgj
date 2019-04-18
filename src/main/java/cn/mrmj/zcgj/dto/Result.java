package cn.mrmj.zcgj.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description: 封装的结果集
 * @author: 稚生
 * @date: 2019/4/15 10:47
 * @version: V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result implements Serializable {
    private boolean result;
    private String message;
}
