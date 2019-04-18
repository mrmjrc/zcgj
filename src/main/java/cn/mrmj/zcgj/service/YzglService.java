package cn.mrmj.zcgj.service;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.po.YzglPo;
import cn.mrmj.zcgj.po.ZzglPo;

/**
 * @description:种猪 Service
 * @author: 稚生
 * @date: 2019/4/15 10:40
 * @version: V1.0
 */
public interface YzglService {
   public PageResult findYzgl(int pageNum, int pageSize);

    public void addYzgl(YzglPo yzglPo);

    public void update(YzglPo yzglPo);

    public YzglPo findOne(Integer id);

    public YzglPo selectByEarNum(String earNumber);

    public ZzglPo selectByMearNum(String mearNumber);

    public void deleteById(Integer id);

    public void delete(Long[] ids);

  public PageResult findYzgl(YzglPo yzglPo, int pageNum, int pageSize);

}
