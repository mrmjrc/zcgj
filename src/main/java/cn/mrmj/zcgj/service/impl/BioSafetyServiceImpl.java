package cn.mrmj.zcgj.service.impl;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.mapper.BioSafetyMapper;
import cn.mrmj.zcgj.po.BioSafetyPo;
import cn.mrmj.zcgj.service.BioSafetyService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 生物安全 Serviceimpl
 * @author: 稚生
 * @date: 2019/4/15 10:41
 * @version: V1.0
 */
@Service
public class BioSafetyServiceImpl implements BioSafetyService {

    @Resource
    private BioSafetyMapper bioSafetyMapper;

    @Override
    public PageResult findBioSafety(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<BioSafetyPo> page = (Page<BioSafetyPo>) bioSafetyMapper.query();
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void addBioSafety(BioSafetyPo bioSafetyPo) {
        bioSafetyMapper.insert(bioSafetyPo);
    }

    @Override
    public BioSafetyPo selectByEarNum(String earNumber) {
        return bioSafetyMapper.selectByEarNum(earNumber);
    }

    @Override
    public void deleteById(Integer id) {
        bioSafetyMapper.deleteById(id);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            bioSafetyMapper.deleteByIds(id);
        }
    }

    @Override
    public PageResult findBioSafety(BioSafetyPo bioSafetyPo, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<BioSafetyPo> page = (Page<BioSafetyPo>) bioSafetyMapper.selectByExample(bioSafetyPo);
        return new PageResult(page.getTotal(),page.getResult());
    }


    @Override
    public BioSafetyPo findOne(Integer id) {
        return bioSafetyMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(BioSafetyPo bioSafetyPo) {
        bioSafetyMapper.update(bioSafetyPo);
    }
}
