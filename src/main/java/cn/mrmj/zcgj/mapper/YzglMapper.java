package cn.mrmj.zcgj.mapper;


import cn.mrmj.zcgj.po.YzglPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description: yzgl mapper
 * @author: 稚生
 * @date: 2019/4/12 15:14
 * @version: V1.0
 */
@Mapper
public interface YzglMapper {
    /**
     * 数据查询
     * @return list
     */
    List<YzglPo> query();

    /**
     * 数据添加
     * @return void
     */
    void insert(YzglPo yzglPo);

    /**
     * 数据更新
     * @param yzglPo
     */
    void update(YzglPo yzglPo);

    /**
     * 根据关键字id进行查询
     * @param id
     * @return
     */
    YzglPo selectByPrimaryKey(@Param("id") Integer id);

    /**
     * 根据关键字耳号查询
     * @param earNumber
     * @return
     */
    YzglPo selectByEarNum(@Param("earNumber") String earNumber);

    /**
     * 根据id删除
     * @param id
     */
    void deleteById(@Param("id") Integer id);

    /**
     * 根据id循环删除
     * @param id
     */
    void deleteByIds(@Param("id") Long id);

    /**
     * 根据关键字查询
     * @param yzglPo
     * @return
     */
    List<YzglPo> selectByExample(YzglPo yzglPo);
}
