package cn.mrmj.zcgj.controller;



import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.dto.Result;
import cn.mrmj.zcgj.po.BreedingPigPo;
import cn.mrmj.zcgj.service.BreedingPigService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @description: 种猪 Controller
 * @author: 稚生
 * @date: 2019/4/12 15:18
 * @version: V1.0
 */
@Controller
@RequestMapping("/breedingPig")
public class BreedingPigController {

    @Resource
    private BreedingPigService breedingPigService;

    @RequestMapping("/findPage")
    @ResponseBody
    public PageResult query(int page, int size) {
        return breedingPigService.findBreedingPig(page, size);
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result add(BreedingPigPo breedingPigPo) {
        try {
            if (null != breedingPigService.selectByEarNum(breedingPigPo.getEarNumber())) {
                return new Result(false, "添加失败");
            } else {
                breedingPigService.addBreedingPig(breedingPigPo);
                return new Result(true, "添加成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "添加失败");
        }
    }
    @RequestMapping("/updateById")
    @ResponseBody
    public Result updateById(BreedingPigPo breedingPigPo) {
        //System.out.println(zzglPo);
        try {
            breedingPigService.update(breedingPigPo);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }


    @RequestMapping("/selectByEarNum")
    @ResponseBody
    public Result selectByEarNum(String earNumber){
        BreedingPigPo breedingPigPo = breedingPigService.selectByEarNum(earNumber);
        if (breedingPigPo != null) {
            return new Result(true, "耳号已存在");
        } else {
            return new Result(false, "正常");
        }
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public BreedingPigPo selectById(int id) {
        return  breedingPigService.findOne(id);

    }


    @RequestMapping("/deleteById")
    @ResponseBody
    public Result deleteById(Integer id) {
        //System.out.println(id);
        try {
            breedingPigService.deleteById(id);
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
            breedingPigService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    @RequestMapping("/searchByExample")
    @ResponseBody
    public PageResult query(@RequestBody BreedingPigPo breedingPigPo, int page, int size) {
        return breedingPigService.findBreedingPig(breedingPigPo, page, size);
    }




}
