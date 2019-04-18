package cn.mrmj.zcgj.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 分页封装的结果集
 * @author: 稚生
 * @date: 2019/4/15 11:40
 * @version: V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult implements Serializable {
    /**
     *总记录数
     */
    private long total;
    /**
     *当前页结果
     */
    private List rows;

}
