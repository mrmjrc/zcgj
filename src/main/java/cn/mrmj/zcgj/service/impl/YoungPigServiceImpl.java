package cn.mrmj.zcgj.service.impl;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.mapper.YoungPigMapper;
import cn.mrmj.zcgj.mapper.BreedingPigMapper;
import cn.mrmj.zcgj.po.YoungPigPo;
import cn.mrmj.zcgj.po.BreedingPigPo;
import cn.mrmj.zcgj.service.YoungPigService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 幼猪 ServiceImpl
 * @author: 稚生
 * @date: 2019/4/15 10:41
 * @version: V1.0
 */
@Service
public class YoungPigServiceImpl implements YoungPigService {

    @Resource
    private YoungPigMapper youngPigMapper;
    @Resource
    private BreedingPigMapper breedingPigMapper;

    @Override
    public PageResult findYoungPig(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<YoungPigPo> page = (Page<YoungPigPo>) youngPigMapper.query();
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void addYoungPig(YoungPigPo youngPigPo) {
        youngPigMapper.insert(youngPigPo);
    }

    @Override
    public YoungPigPo selectByEarNum(String earNumber) {
        return youngPigMapper.selectByEarNum(earNumber);
    }

    @Override
    public BreedingPigPo selectByMearNum(String mearNumber){
        return breedingPigMapper.selectByEarNum(mearNumber);
    }

    @Override
    public void deleteById(Integer id) {
        youngPigMapper.deleteById(id);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            youngPigMapper.deleteByIds(id);
        }
    }

    @Override
    public PageResult findYoungPig(YoungPigPo youngPigPo, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<YoungPigPo> page = (Page<YoungPigPo>) youngPigMapper.selectByExample(youngPigPo);
        return new PageResult(page.getTotal(),page.getResult());
    }


    @Override
    public YoungPigPo findOne(Integer id) {
        return youngPigMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(YoungPigPo youngPigPo) {
        youngPigMapper.update(youngPigPo);
    }
}
