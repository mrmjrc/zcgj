package cn.mrmj.zcgj.controller;



import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.dto.Result;
import cn.mrmj.zcgj.po.BioSafetyPo;
import cn.mrmj.zcgj.service.BioSafetyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @description: 生物安全 Controller
 * @author: 稚生
 * @date: 2019/4/12 15:18
 * @version: V1.0
 */
@Controller
@RequestMapping("/bioSafety")
public class BioSafetyController {

    @Resource
    private BioSafetyService bioSafetyService;

    @RequestMapping("/findAll")
    @ResponseBody
    public PageResult query() {
        return bioSafetyService.findBioSafety();
    }


    @RequestMapping("/add")
    @ResponseBody
    public Result add(BioSafetyPo bioSafetyPo) {
        try {
            if (null != bioSafetyService.selectByEarNum(bioSafetyPo.getEarNumber())) {
                return new Result(false, "添加失败");
            } else {
                bioSafetyService.addBioSafety(bioSafetyPo);
                return new Result(true, "添加成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "添加失败");
        }
    }
    @RequestMapping("/updateById")
    @ResponseBody
    public Result updateById(BioSafetyPo bioSafetyPo) {
        try {
            bioSafetyService.update(bioSafetyPo);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }


    @RequestMapping("/selectByEarNum")
    @ResponseBody
    public Result selectByEarNum(String earNumber){
        BioSafetyPo bioSafetyPo= bioSafetyService.selectByEarNum(earNumber);
        if (bioSafetyPo != null) {
            return new Result(true, "耳号已存在");
        } else {
            return new Result(false, "正常");
        }
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public BioSafetyPo selectById(int id) {
        return bioSafetyService.findOne(id);

    }


    @RequestMapping("/deleteById")
    @ResponseBody
    public Result deleteById(Integer id) {
        //System.out.println(id);
        try {
            bioSafetyService.deleteById(id);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(Long[] ids) {
        try {
            bioSafetyService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    @RequestMapping("/searchByExample")
    @ResponseBody
    public PageResult query(@RequestBody BioSafetyPo bioSafetyPo, int page, int size) {
        return bioSafetyService.findBioSafety(bioSafetyPo, page, size);
    }
}
