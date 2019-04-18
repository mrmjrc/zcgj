package cn.mrmj.zcgj.service;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.po.GoodsPo;
import cn.mrmj.zcgj.po.ProductionPo;

/**
 * @description: 生产 Service
 * @author: 稚生
 * @date: 2019/4/15 10:40
 * @version: V1.0
 */
public interface GoodsService {

    public PageResult findGoods(int pageNum, int pageSize);

    public void addGoods(GoodsPo goodsPo);

    public void update(GoodsPo goodsPo);

    public GoodsPo findOne(Integer id);

    public void deleteById(Integer id);

    public void delete(Long[] ids);

  public PageResult findGoods(GoodsPo goodsPo, int pageNum, int pageSize);

}
