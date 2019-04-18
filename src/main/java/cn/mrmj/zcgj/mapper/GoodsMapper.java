package cn.mrmj.zcgj.mapper;


import cn.mrmj.zcgj.po.GoodsPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description: Goods mapper
 * @author: 稚生
 * @date: 2019/4/12 15:14
 * @version: V1.0
 */
@Mapper
public interface GoodsMapper {
    /**
     * 数据查询
     * @return list
     */
    List<GoodsPo> query();

    /**
     * 数据添加
     * @return void
     */
    void insert(GoodsPo goodsPo);

    /**
     * 数据更新
     * @param goodsPo
     */
    void update(GoodsPo goodsPo);

    /**
     * 根据关键字id进行查询
     * @param id
     * @return
     */
    GoodsPo selectByPrimaryKey(@Param("id") Integer id);


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
     * @param goodsPo
     * @return
     */
    List<GoodsPo> selectByExample(GoodsPo goodsPo);
}
