package cn.mrmj.zcgj.service.impl;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.mapper.YzglMapper;
import cn.mrmj.zcgj.mapper.ZzglMapper;
import cn.mrmj.zcgj.po.YzglPo;
import cn.mrmj.zcgj.po.ZzglPo;
import cn.mrmj.zcgj.service.YzglService;
import cn.mrmj.zcgj.service.ZzglService;
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
public class YzglServiceimpl implements YzglService {

    @Resource
    private YzglMapper yzglMapper;
    @Resource
    private ZzglMapper zzglMapper;

    @Override
    public PageResult findYzgl(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<YzglPo> page = (Page<YzglPo>) yzglMapper.query();
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void addYzgl(YzglPo yzglPo) {
        yzglMapper.insert(yzglPo);
    }

    @Override
    public YzglPo selectByEarNum(String earNumber) {
        return yzglMapper.selectByEarNum(earNumber);
    }

    @Override
    public ZzglPo selectByMearNum(String mearNumber){
        return zzglMapper.selectByEarNum(mearNumber);
    }

    @Override
    public void deleteById(Integer id) {
        yzglMapper.deleteById(id);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            yzglMapper.deleteByIds(id);
        }
    }

    @Override
    public PageResult findYzgl(YzglPo yzglPo, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<YzglPo> page = (Page<YzglPo>) yzglMapper.selectByExample(yzglPo);
        return new PageResult(page.getTotal(),page.getResult());
    }


    @Override
    public YzglPo findOne(Integer id) {
        return yzglMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(YzglPo yzglPo) {
        yzglMapper.update(yzglPo);
    }
}
