package cn.mrmj.zcgj.service;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.po.PorkerPigPo;

/**
 * @description:肉猪 Service
 * @author: 稚生
 * @date: 2019/4/15 10:40
 * @version: V1.0
 */
public interface PorkerPigService {
   public PageResult findPorkerPig(int pageNum, int pageSize);

    public void addPorkerPig(PorkerPigPo porkerPigPo);

    public void update(PorkerPigPo porkerPigPo);

    public PorkerPigPo findOne(Integer id);

    public PorkerPigPo selectByEarNum(String earNumber);

    public void deleteById(Integer id);

    public void delete(Long[] ids);

  public PageResult findPorkerPig(PorkerPigPo porkerPigPo, int pageNum, int pageSize);

}
