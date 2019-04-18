package cn.mrmj.zcgj.service.impl;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.mapper.ZzglMapper;
import cn.mrmj.zcgj.po.ZzglPo;
import cn.mrmj.zcgj.service.ZzglService;
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
public class ZzglServiceimpl implements ZzglService {

    @Resource
    private ZzglMapper zzglMapper;

    @Override
    public PageResult findZzgl(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<ZzglPo> page = (Page<ZzglPo>) zzglMapper.query();
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void addZzgl(ZzglPo zzglPo) {
        zzglMapper.insert(zzglPo);
    }

    @Override
    public ZzglPo selectByEarNum(String earNumber) {
        return zzglMapper.selectByEarNum(earNumber);
    }


    @Override
    public void deleteById(Integer id) {
        zzglMapper.deleteById(id);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            zzglMapper.deleteByIds(id);
        }
    }

    @Override
    public PageResult findZzgl(ZzglPo zzglPo, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<ZzglPo> page = (Page<ZzglPo>) zzglMapper.selectByExample(zzglPo);
        return new PageResult(page.getTotal(),page.getResult());
    }


    @Override
    public ZzglPo findOne(Integer id) {
        return zzglMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(ZzglPo zzglPo) {
        zzglMapper.update(zzglPo);
    }
}
