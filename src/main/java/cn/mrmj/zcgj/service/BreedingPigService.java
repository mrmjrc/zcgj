package cn.mrmj.zcgj.service;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.po.BreedingPigPo;

/**
 * @description: 种猪 Service
 * @author: 稚生
 * @date: 2019/4/15 10:40
 * @version: V1.0
 */
public interface BreedingPigService {
   public PageResult findBreedingPig(int pageNum , int pageSize);

    public void addBreedingPig(BreedingPigPo breedingPigPo);

    public void update(BreedingPigPo breedingPigPo);

    public BreedingPigPo findOne(Integer id);

    public BreedingPigPo selectByEarNum(String earNumber);

    public void deleteById(Integer id);

    public void delete(Long[] ids);

  public PageResult findBreedingPig(BreedingPigPo breedingPigPo, int pageNum , int pageSize);

}
