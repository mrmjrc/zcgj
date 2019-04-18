package cn.mrmj.zcgj.controller;



import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.dto.Result;
import cn.mrmj.zcgj.po.RzglPo;
import cn.mrmj.zcgj.po.YzglPo;
import cn.mrmj.zcgj.po.ZzglPo;
import cn.mrmj.zcgj.service.RzglService;
import cn.mrmj.zcgj.service.YzglService;
import cn.mrmj.zcgj.service.ZzglService;
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
@RequestMapping("/rzgl")
public class RzglController {

    @Resource
    private RzglService rzglService;

    @RequestMapping("/findPage")
    @ResponseBody
    public PageResult query(int page, int size) {
        return rzglService.findRzgl(page, size);
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result add(RzglPo rzglPo) {
        try {
            if (null != rzglService.selectByEarNum(rzglPo.getEarNumber())) {
                return new Result(false, "添加失败");
            } else {
                rzglService.addRzgl(rzglPo);
                return new Result(true, "添加成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "添加失败");
        }
    }
    @RequestMapping("/updateById")
    @ResponseBody
    public Result updateById(RzglPo rzglPo) {
        try {
            rzglService.update(rzglPo);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }


    @RequestMapping("/selectByEarNum")
    @ResponseBody
    public Result selectByEarNum(String earNumber){
        RzglPo rzglPo= rzglService.selectByEarNum(earNumber);
        if (rzglPo != null) {
            return new Result(true, "耳号已存在");
        } else {
            return new Result(false, "正常");
        }
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public RzglPo selectById(int id) {
        return rzglService.findOne(id);

    }


    @RequestMapping("/deleteById")
    @ResponseBody
    public Result deleteById(Integer id) {
        //System.out.println(id);
        try {
            rzglService.deleteById(id);
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
            rzglService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    @RequestMapping("/searchByExample")
    @ResponseBody
    public PageResult query(@RequestBody RzglPo rzglPo, int page, int size) {
        return rzglService.findRzgl(rzglPo, page, size);
    }




}
