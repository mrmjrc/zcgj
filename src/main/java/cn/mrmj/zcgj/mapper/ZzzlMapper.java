package cn.mrmj.zcgj.mapper;


import cn.mrmj.zcgj.po.ZzzlPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: 稚生
 * @date: 2019/4/12 15:14
 * @version: V1.0
 */
@Mapper
public interface ZzzlMapper {
    /**
     * 数据查询
     * @return list
     */
    List<ZzzlPo> query();

    /**
     * 数据添加
     * @return void
     */
    void insert(ZzzlPo zzzlPo);

    /**
     * 数据更新
     * @param zzzlPo
     */
    void update(ZzzlPo zzzlPo);

    /**
     * 根据关键字id进行查询
     * @param id
     * @return
     */
    ZzzlPo selectByPrimaryKey(@Param("id")Integer id);

    /**
     * 根据关键字耳号查询
     * @param earNumber
     * @return
     */
    ZzzlPo selectByEarNum(@Param("earNumber")Integer earNumber);

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
     * @param zzzlPo
     * @return
     */
    List<ZzzlPo> selectByExample(ZzzlPo zzzlPo);
}
