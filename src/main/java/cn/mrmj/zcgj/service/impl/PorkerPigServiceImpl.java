package cn.mrmj.zcgj.service.impl;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.mapper.PorkerPigMapper;
import cn.mrmj.zcgj.po.PorkerPigPo;
import cn.mrmj.zcgj.service.PorkerPigService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 肉猪 Serviceimpl
 * @author: 稚生
 * @date: 2019/4/15 10:41
 * @version: V1.0
 */
@Service
public class PorkerPigServiceImpl implements PorkerPigService {

    @Resource
    private PorkerPigMapper porkerPigMapper;

    @Override
    public PageResult findPorkerPig(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<PorkerPigPo> page = (Page<PorkerPigPo>) porkerPigMapper.query();
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void addPorkerPig(PorkerPigPo porkerPigPo) {
        porkerPigMapper.insert(porkerPigPo);
    }

    @Override
    public PorkerPigPo selectByEarNum(String earNumber) {
        return porkerPigMapper.selectByEarNum(earNumber);
    }

    @Override
    public void deleteById(Integer id) {
        porkerPigMapper.deleteById(id);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            porkerPigMapper.deleteByIds(id);
        }
    }

    @Override
    public PageResult findPorkerPig(PorkerPigPo porkerPigPo, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<PorkerPigPo> page = (Page<PorkerPigPo>) porkerPigMapper.selectByExample(porkerPigPo);
        return new PageResult(page.getTotal(),page.getResult());
    }


    @Override
    public PorkerPigPo findOne(Integer id) {
        return porkerPigMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(PorkerPigPo porkerPigPo) {
        porkerPigMapper.update(porkerPigPo);
    }
}
