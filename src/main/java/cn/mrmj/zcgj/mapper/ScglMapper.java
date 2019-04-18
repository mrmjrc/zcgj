package cn.mrmj.zcgj.mapper;


import cn.mrmj.zcgj.po.RzglPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description: rzgl mapper
 * @author: 稚生
 * @date: 2019/4/12 15:14
 * @version: V1.0
 */
@Mapper
public interface ScglMapper {
    /**
     * 数据查询
     * @return list
     */
    List<RzglPo> query();

    /**
     * 数据添加
     * @return void
     */
    void insert(RzglPo rzglPo);

    /**
     * 数据更新
     * @param rzglPo
     */
    void update(RzglPo rzglPo);

    /**
     * 根据关键字id进行查询
     * @param id
     * @return
     */
    RzglPo selectByPrimaryKey(@Param("id") Integer id);

    /**
     * 根据关键字耳号查询
     * @param earNumber
     * @return
     */
    RzglPo selectByEarNum(@Param("earNumber") String earNumber);

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
     * @param rzglPo
     * @return
     */
    List<RzglPo> selectByExample(RzglPo rzglPo);
}
