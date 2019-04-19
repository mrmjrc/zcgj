package cn.mrmj.zcgj.controller;



import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.dto.Result;
import cn.mrmj.zcgj.po.PorkerPigPo;
import cn.mrmj.zcgj.service.PorkerPigService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @description: 肉猪 Controller
 * @author: 稚生
 * @date: 2019/4/12 15:18
 * @version: V1.0
 */
@Controller
@RequestMapping("/porkerPig")
public class PorkerPigController {

    @Resource
    private PorkerPigService porkerPigService;


    @RequestMapping("/findAll")
    @ResponseBody
    public PageResult query() {
        return porkerPigService.findPorkerPig();
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result add(PorkerPigPo porkerPigPo) {
        try {
            if (null != porkerPigService.selectByEarNum(porkerPigPo.getEarNumber())) {
                return new Result(false, "添加失败");
            } else {
                porkerPigService.addPorkerPig(porkerPigPo);
                return new Result(true, "添加成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "添加失败");
        }
    }
    @RequestMapping("/updateById")
    @ResponseBody
    public Result updateById(PorkerPigPo porkerPigPo) {
        try {
            porkerPigService.update(porkerPigPo);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }


    @RequestMapping("/selectByEarNum")
    @ResponseBody
    public Result selectByEarNum(String earNumber){
        PorkerPigPo porkerPigPo= porkerPigService.selectByEarNum(earNumber);
        if (porkerPigPo != null) {
            return new Result(true, "耳号已存在");
        } else {
            return new Result(false, "正常");
        }
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public PorkerPigPo selectById(int id) {
        return porkerPigService.findOne(id);

    }


    @RequestMapping("/deleteById")
    @ResponseBody
    public Result deleteById(Integer id) {
        //System.out.println(id);
        try {
            porkerPigService.deleteById(id);
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
            porkerPigService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    @RequestMapping("/searchByExample")
    @ResponseBody
    public PageResult query(@RequestBody PorkerPigPo porkerPigPo, int page, int size) {
        return porkerPigService.findPorkerPig(porkerPigPo, page, size);
    }




}
