package cn.mrmj.zcgj.controller;



import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.dto.Result;
import cn.mrmj.zcgj.po.YzglPo;
import cn.mrmj.zcgj.po.ZzglPo;
import cn.mrmj.zcgj.service.YzglService;
import cn.mrmj.zcgj.service.ZzglService;
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
@RequestMapping("/yzgl")
public class YzglController {

    @Resource
    private ZzglService zzglService;

    @Resource
    private YzglService yzglService;

    @RequestMapping("/findPage")
    @ResponseBody
    public PageResult query(int page, int size) {
        return yzglService.findYzgl(page, size);
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result add(YzglPo yzglPo) {
        try {
            if (null != yzglService.selectByEarNum(yzglPo.getEarNumber()) || null == zzglService.selectByEarNum(yzglPo.getMearNumber())) {
                return new Result(false, "添加失败");
            } else {
                yzglService.addYzgl(yzglPo);
                return new Result(true, "添加成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "添加失败");
        }
    }
    @RequestMapping("/updateById")
    @ResponseBody
    public Result updateById(YzglPo yzglPo) {
        try {
            yzglService.update(yzglPo);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }


    @RequestMapping("/selectByEarNum")
    @ResponseBody
    public Result selectByEarNum(String earNumber){
        ZzglPo zzglPo = zzglService.selectByEarNum(earNumber);
        if (zzglPo != null) {
            return new Result(true, "耳号已存在");
        } else {
            return new Result(false, "正常");
        }
    }
    @RequestMapping("/selectByMearNum")
    @ResponseBody
    public Result selectByMearNum(String mearNumber){
        ZzglPo zzglPo = zzglService.selectByEarNum(mearNumber);
        if (zzglPo != null) {
            return new Result(true, "耳号存在");
        } else {
            return new Result(false, "耳号不存在");
        }
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public YzglPo selectById(int id) {
        return yzglService.findOne(id);

    }


    @RequestMapping("/deleteById")
    @ResponseBody
    public Result deleteById(Integer id) {
        //System.out.println(id);
        try {
            yzglService.deleteById(id);
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
            yzglService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    @RequestMapping("/searchByExample")
    @ResponseBody
    public PageResult query(@RequestBody YzglPo yzglPo, int page, int size) {
        return yzglService.findYzgl(yzglPo, page, size);
    }




}
