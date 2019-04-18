package cn.mrmj.zcgj.service.impl;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.mapper.GoodsMapper;
import cn.mrmj.zcgj.po.GoodsPo;
import cn.mrmj.zcgj.service.GoodsService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 物品 Serviceimpl
 * @author: 稚生
 * @date: 2019/4/15 10:41
 * @version: V1.0
 */
@Service
public class GoodsServiceimpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public PageResult findGoods(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<GoodsPo> page = (Page<GoodsPo>) goodsMapper.query();
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void addGoods(GoodsPo goodsPo) {
        goodsMapper.insert(goodsPo);
    }

    @Override
    public void deleteById(Integer id) {
        goodsMapper.deleteById(id);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            goodsMapper.deleteByIds(id);
        }
    }

    @Override
    public PageResult findGoods(GoodsPo goodsPo, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<GoodsPo> page = (Page<GoodsPo>) goodsMapper.selectByExample(goodsPo);
        return new PageResult(page.getTotal(),page.getResult());
    }


    @Override
    public GoodsPo findOne(Integer id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(GoodsPo goodsPo) {
        goodsMapper.update(goodsPo);
    }
}
