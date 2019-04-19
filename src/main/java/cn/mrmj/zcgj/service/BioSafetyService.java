package cn.mrmj.zcgj.service;

import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.po.BioSafetyPo;

/**
 * @description: 生物安全 Service
 * @author: 稚生
 * @date: 2019/4/15 10:40
 * @version: V1.0
 */
public interface BioSafetyService {
   public PageResult findBioSafety(int pageNum, int pageSize);

    public void addBioSafety(BioSafetyPo bioSafetyPo);

    public void update(BioSafetyPo bioSafetyPo);

    public BioSafetyPo findOne(Integer id);

    public BioSafetyPo selectByEarNum(String earNumber);

    public void deleteById(Integer id);

    public void delete(Long[] ids);

  public PageResult findBioSafety(BioSafetyPo bioSafetyPo, int pageNum, int pageSize);

}
