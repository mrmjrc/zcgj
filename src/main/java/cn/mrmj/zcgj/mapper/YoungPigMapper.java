package cn.mrmj.zcgj.mapper;


import cn.mrmj.zcgj.po.YoungPigPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description: youngPig mapper
 * @author: 稚生
 * @date: 2019/4/12 15:14
 * @version: V1.0
 */
@Mapper
public interface YoungPigMapper {
    /**
     * 数据查询
     * @return list
     */
    List<YoungPigPo> query();

    /**
     * 查询总数
     * @return
     */
    int queryCount();
    /**
     * 数据添加
     * @return void
     */
    void insert(YoungPigPo youngPigPo);

    /**
     * 数据更新
     * @param youngPigPo
     */
    void update(YoungPigPo youngPigPo);

    /**
     * 根据关键字id进行查询
     * @param id
     * @return
     */
    YoungPigPo selectByPrimaryKey(@Param("id") Integer id);

    /**
     * 根据关键字耳号查询
     * @param earNumber
     * @return
     */
    YoungPigPo selectByEarNum(@Param("earNumber") String earNumber);

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
     * @param youngPigPo
     * @return
     */
    List<YoungPigPo> selectByExample(YoungPigPo youngPigPo);
}
