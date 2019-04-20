package cn.mrmj.zcgj.service.impl;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.mapper.ProductionMapper;
import cn.mrmj.zcgj.po.ProductionPo;
import cn.mrmj.zcgj.service.ProductionService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 生产 Serviceimpl
 * @author: 稚生
 * @date: 2019/4/15 10:41
 * @version: V1.0
 */
@Service
public class ProductionServiceImpl implements ProductionService {

    @Resource
    private ProductionMapper productionMapper;

    @Override
    public PageResult findProduction() {
        return new PageResult(productionMapper.queryCount(),productionMapper.query());
    }

    @Override
    public void addProduction(ProductionPo productionPo) {
        productionMapper.insert(productionPo);
    }

    @Override
    public ProductionPo selectByEarNum(String earNumber) {
        return productionMapper.selectByEarNum(earNumber);
    }

    @Override
    public void deleteById(Integer id) {
        productionMapper.deleteById(id);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            productionMapper.deleteByIds(id);
        }
    }

    @Override
    public PageResult findProduction(ProductionPo productionPo, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<ProductionPo> page = (Page<ProductionPo>) productionMapper.selectByExample(productionPo);
        return new PageResult(page.getTotal(),page.getResult());
    }


    @Override
    public ProductionPo findOne(Integer id) {
        return productionMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(ProductionPo productionPo) {
        productionMapper.update(productionPo);
    }
}
