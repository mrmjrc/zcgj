package cn.mrmj.zcgj.mapper;


import cn.mrmj.zcgj.po.ZzglPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description: zzgl mapper
 * @author: 稚生
 * @date: 2019/4/12 15:14
 * @version: V1.0
 */
@Mapper
public interface ZzglMapper {
    /**
     * 数据查询
     * @return list
     */
    List<ZzglPo> query();

    /**
     * 数据添加
     * @return void
     */
    void insert(ZzglPo zzglPo);

    /**
     * 数据更新
     * @param zzglPo
     */
    void update(ZzglPo zzglPo);

    /**
     * 根据关键字id进行查询
     * @param id
     * @return
     */
    ZzglPo selectByPrimaryKey(@Param("id")Integer id);

    /**
     * 根据关键字耳号查询
     * @param earNumber
     * @return
     */
    ZzglPo selectByEarNum(@Param("earNumber")String earNumber);

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
     * @param zzglPo
     * @return
     */
    List<ZzglPo> selectByExample(ZzglPo zzglPo);
}
