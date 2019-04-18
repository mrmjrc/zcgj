package cn.mrmj.zcgj.service;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.po.ZzglPo;

/**
 * @description:种猪 Service
 * @author: 稚生
 * @date: 2019/4/15 10:40
 * @version: V1.0
 */
public interface ZzglService {
   public PageResult findZzgl(int pageNum , int pageSize);

    public void addZzgl(ZzglPo zzglPo);

    public void update(ZzglPo zzglPo);

    public ZzglPo findOne(Integer id);

    public ZzglPo selectByEarNum(String earNumber);

    public void deleteById(Integer id);

    public void delete(Long[] ids);

  public PageResult findZzgl(ZzglPo zzglPo, int pageNum , int pageSize);

}
