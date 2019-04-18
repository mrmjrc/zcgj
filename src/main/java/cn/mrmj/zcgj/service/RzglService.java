package cn.mrmj.zcgj.service;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.po.RzglPo;

/**
 * @description:种猪 Service
 * @author: 稚生
 * @date: 2019/4/15 10:40
 * @version: V1.0
 */
public interface RzglService {
   public PageResult findRzgl(int pageNum, int pageSize);

    public void addRzgl(RzglPo rzglPo);

    public void update(RzglPo rzglPo);

    public RzglPo findOne(Integer id);

    public RzglPo selectByEarNum(String earNumber);

    public void deleteById(Integer id);

    public void delete(Long[] ids);

  public PageResult findRzgl(RzglPo rzglPo, int pageNum, int pageSize);

}
