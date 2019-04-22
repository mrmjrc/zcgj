package cn.mrmj.zcgj.service;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.po.YoungPigPo;
import cn.mrmj.zcgj.po.BreedingPigPo;

/**
 * @description:种猪 Service
 * @author: 稚生
 * @date: 2019/4/15 10:40
 * @version: V1.0
 */
public interface YoungPigService {
   public PageResult findYoungPig();

    public void addYoungPig(YoungPigPo youngPigPo);

    public void update(YoungPigPo youngPigPo);

    public YoungPigPo findOne(Integer id);

    public YoungPigPo selectByEarNum(String earNumber);

    public BreedingPigPo selectByMearNum(String mearNumber);

    public void deleteById(Integer id);

    public void delete(Long[] ids);

  public PageResult findYoungPig(YoungPigPo youngPigPo, int pageNum, int pageSize);

  public PageResult findYoungPigByBearNum(String earNumber);

}
