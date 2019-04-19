package cn.mrmj.zcgj.controller;



import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.dto.Result;
import cn.mrmj.zcgj.po.YoungPigPo;
import cn.mrmj.zcgj.po.BreedingPigPo;
import cn.mrmj.zcgj.service.YoungPigService;
import cn.mrmj.zcgj.service.BreedingPigService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @description: 幼猪 Controller
 * @author: 稚生
 * @date: 2019/4/12 15:18
 * @version: V1.0
 */
@Controller
@RequestMapping("/youngPig")
public class YoungPigController {

    @Resource
    private BreedingPigService breedingPigService;

    @Resource
    private YoungPigService youngPigService;

    @RequestMapping("/findPage")
    @ResponseBody
    public PageResult query(int page, int size) {
        return youngPigService.findYoungPig(page, size);
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result add(YoungPigPo youngPigPo) {
        try {
            if (null != youngPigService.selectByEarNum(youngPigPo.getEarNumber()) || null == breedingPigService.selectByEarNum(youngPigPo.getMearNumber())) {
                return new Result(false, "添加失败");
            } else {
                youngPigService.addYoungPig(youngPigPo);
                return new Result(true, "添加成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "添加失败");
        }
    }
    @RequestMapping("/updateById")
    @ResponseBody
    public Result updateById(YoungPigPo youngPigPo) {
        try {
            youngPigService.update(youngPigPo);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }


    @RequestMapping("/selectByEarNum")
    @ResponseBody
    public Result selectByEarNum(String earNumber){
        YoungPigPo youngPigPo= youngPigService.selectByEarNum(earNumber);
        if (youngPigPo != null) {
            return new Result(true, "耳号已存在");
        } else {
            return new Result(false, "正常");
        }
    }
    @RequestMapping("/selectByMearNum")
    @ResponseBody
    public Result selectByMearNum(String mearNumber){
        BreedingPigPo breedingPigPo = breedingPigService.selectByEarNum(mearNumber);
        if (breedingPigPo != null) {
            return new Result(true, "耳号存在");
        } else {
            return new Result(false, "耳号不存在");
        }
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public YoungPigPo selectById(int id) {
        return youngPigService.findOne(id);

    }


    @RequestMapping("/deleteById")
    @ResponseBody
    public Result deleteById(Integer id) {
        //System.out.println(id);
        try {
            youngPigService.deleteById(id);
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
            youngPigService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    @RequestMapping("/searchByExample")
    @ResponseBody
    public PageResult query(@RequestBody YoungPigPo youngPigPo, int page, int size) {
        return youngPigService.findYoungPig(youngPigPo, page, size);
    }




}
