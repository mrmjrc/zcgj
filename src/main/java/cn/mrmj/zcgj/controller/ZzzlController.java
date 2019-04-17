package cn.mrmj.zcgj.controller;



import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.dto.Result;
import cn.mrmj.zcgj.po.ZzzlPo;
import cn.mrmj.zcgj.service.ZzzlService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @description:
 * @author: 稚生
 * @date: 2019/4/12 15:18
 * @version: V1.0
 */
@Controller
@RequestMapping("/zzzl")
public class ZzzlController {

    @Resource
    private ZzzlService zzzlService;

    @RequestMapping("/findPage")
    @ResponseBody
    public PageResult query(int page, int size) {
        return zzzlService.findZzzl(page, size);
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result add(ZzzlPo zzzl) {
        try {
            if (zzzlService.selectByEarNum(zzzl.getEarNumber()) != null) {
                return new Result(false, "添加失败");
            } else {
                zzzlService.addZzzl(zzzl);
                return new Result(true, "添加成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "添加失败");
        }
    }
    @RequestMapping("/updateById")
    @ResponseBody
    public Result updateById(ZzzlPo zzzl) {
        System.out.println(zzzl);
        try {
            zzzlService.update(zzzl);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }


    @RequestMapping("/selectByEarNum")
    @ResponseBody
    public Result selectByEarNum(int earNumber){
        ZzzlPo zzzl = zzzlService.selectByEarNum(earNumber);
        if (zzzl != null) {
            return new Result(true, "耳号已存在");
        } else {
            return new Result(false, "正常");
        }
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public ZzzlPo selectById(int id) {
        ZzzlPo zzzl = zzzlService.findOne(id);
        return zzzl;
    }


    @RequestMapping("/deleteById")
    @ResponseBody
    public Result deleteById(Integer id) {
        //System.out.println(id);
        try {
            zzzlService.deleteById(id);
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
            zzzlService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    @RequestMapping("/searchByExample")
    @ResponseBody
    public PageResult query(@RequestBody ZzzlPo zzzl, int page, int size) {
        return zzzlService.findZzzl(zzzl, page, size);
    }




}
