package cn.mrmj.zcgj.service.impl;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.mapper.ZzzlMapper;
import cn.mrmj.zcgj.po.ZzzlPo;
import cn.mrmj.zcgj.service.ZzzlService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: 稚生
 * @date: 2019/4/15 10:41
 * @version: V1.0
 */
@Service
public class ZzzlServiceimpl implements ZzzlService {

    @Resource
    private ZzzlMapper zzzlMapper;

    @Override
    public PageResult findZzzl(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<ZzzlPo> page = (Page<ZzzlPo>) zzzlMapper.query();
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void addZzzl(ZzzlPo zzzl) {
        zzzlMapper.insert(zzzl);
    }

    @Override
    public ZzzlPo selectByEarNum(Integer earNumber) {
        return zzzlMapper.selectByEarNum(earNumber);
    }

    @Override
    public void deleteById(Integer id) {
        zzzlMapper.deleteById(id);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            zzzlMapper.deleteByIds(id);
        }
    }

    @Override
    public PageResult findZzzl(ZzzlPo zzzl, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<ZzzlPo> page = (Page<ZzzlPo>) zzzlMapper.selectByExample(zzzl);
        new PageResult(page.getTotal(),page.getResult());
        return new PageResult(page.getTotal(),page.getResult());
    }


    @Override
    public ZzzlPo findOne(Integer id) {
        return zzzlMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(ZzzlPo zzzl) {
        zzzlMapper.update(zzzl);
    }
}
