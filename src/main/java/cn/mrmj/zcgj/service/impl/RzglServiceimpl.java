package cn.mrmj.zcgj.service.impl;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.mapper.RzglMapper;
import cn.mrmj.zcgj.po.RzglPo;
import cn.mrmj.zcgj.service.RzglService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 幼猪 Serviceimpl
 * @author: 稚生
 * @date: 2019/4/15 10:41
 * @version: V1.0
 */
@Service
public class RzglServiceimpl implements RzglService {

    @Resource
    private RzglMapper rzglMapper;

    @Override
    public PageResult findRzgl(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<RzglPo> page = (Page<RzglPo>) rzglMapper.query();
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void addRzgl(RzglPo rzglPo) {
        rzglMapper.insert(rzglPo);
    }

    @Override
    public RzglPo selectByEarNum(String earNumber) {
        return rzglMapper.selectByEarNum(earNumber);
    }

    @Override
    public void deleteById(Integer id) {
        rzglMapper.deleteById(id);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            rzglMapper.deleteByIds(id);
        }
    }

    @Override
    public PageResult findRzgl(RzglPo rzglPo, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<RzglPo> page = (Page<RzglPo>) rzglMapper.selectByExample(rzglPo);
        return new PageResult(page.getTotal(),page.getResult());
    }


    @Override
    public RzglPo findOne(Integer id) {
        return rzglMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(RzglPo rzglPo) {
        rzglMapper.update(rzglPo);
    }
}
