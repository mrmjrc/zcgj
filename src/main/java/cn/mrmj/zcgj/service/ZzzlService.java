package cn.mrmj.zcgj.service;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.po.ZzzlPo;

/**
 * @description:
 * @author: 稚生
 * @date: 2019/4/15 10:40
 * @version: V1.0
 */
public interface ZzzlService {
   public PageResult findZzzl(int pageNum , int pageSize);

    public void addZzzl(ZzzlPo zzzl);

    public void update(ZzzlPo zzzl);

    public ZzzlPo findOne(Integer id);

    public ZzzlPo selectByEarNum(Integer earNumber);

    public void deleteById(Integer id);

    public void delete(Long[] ids);

  public PageResult findZzzl(ZzzlPo zzzl, int pageNum , int pageSize);

}
