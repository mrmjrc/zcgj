package cn.mrmj.zcgj.mapper;


import cn.mrmj.zcgj.po.PorkerPigPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description: PorkerPig mapper
 * @author: 稚生
 * @date: 2019/4/12 15:14
 * @version: V1.0
 */
@Mapper
public interface PorkerPigMapper {
    /**
     * 数据查询
     * @return list
     */
    List<PorkerPigPo> query();

    /**
     * 数据添加
     * @return void
     */
    void insert(PorkerPigPo porkerPigPo);

    /**
     * 数据更新
     * @param porkerPigPo
     */
    void update(PorkerPigPo porkerPigPo);

    /**
     * 根据关键字id进行查询
     * @param id
     * @return
     */
    PorkerPigPo selectByPrimaryKey(@Param("id") Integer id);

    /**
     * 根据关键字耳号查询
     * @param earNumber
     * @return
     */
    PorkerPigPo selectByEarNum(@Param("earNumber") String earNumber);

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
     * @param porkerPigPo
     * @return
     */
    List<PorkerPigPo> selectByExample(PorkerPigPo porkerPigPo);
}
