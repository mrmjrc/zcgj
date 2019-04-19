package cn.mrmj.zcgj.service.impl;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.mapper.BreedingPigMapper;
import cn.mrmj.zcgj.po.BreedingPigPo;
import cn.mrmj.zcgj.service.BreedingPigService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 种猪 ServiceImpl
 * @author: 稚生
 * @date: 2019/4/15 10:41
 * @version: V1.0
 */
@Service
public class BreedingPigServiceImpl implements BreedingPigService {

    @Resource
    private BreedingPigMapper breedingPigMapper;

    @Override
    public PageResult findBreedingPig() {


        return new PageResult(breedingPigMapper.queryCount(),breedingPigMapper.query());
    }

    @Override
    public void addBreedingPig(BreedingPigPo zzglPo) {
        breedingPigMapper.insert(zzglPo);
    }

    @Override
    public BreedingPigPo selectByEarNum(String earNumber) {
        return breedingPigMapper.selectByEarNum(earNumber);
    }


    @Override
    public void deleteById(Integer id) {
        breedingPigMapper.deleteById(id);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            breedingPigMapper.deleteByIds(id);
        }
    }

    @Override
    public PageResult findBreedingPig(BreedingPigPo breedingPigPo, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<BreedingPigPo> page = (Page<BreedingPigPo>) breedingPigMapper.selectByExample(breedingPigPo);
        return new PageResult(page.getTotal(),page.getResult());
    }


    @Override
    public BreedingPigPo findOne(Integer id) {
        return breedingPigMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(BreedingPigPo breedingPigPo) {
        breedingPigMapper.update(breedingPigPo);
    }
}
