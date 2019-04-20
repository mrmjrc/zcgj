package cn.mrmj.zcgj.service;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.po.ProductionPo;

/**
 * @description: 生产 Service
 * @author: 稚生
 * @date: 2019/4/15 10:40
 * @version: V1.0
 */
public interface ProductionService {

    public PageResult findProduction();

    public void addProduction(ProductionPo productionPo);

    public void update(ProductionPo productionPo);

    public ProductionPo findOne(Integer id);

    public ProductionPo selectByEarNum(String earNumber);

    public void deleteById(Integer id);

    public void delete(Long[] ids);

  public PageResult findProduction(ProductionPo productionPo, int pageNum, int pageSize);

}
