package cn.mrmj.zcgj.controller;



import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.dto.Result;
import cn.mrmj.zcgj.po.ZzglPo;
import cn.mrmj.zcgj.service.ZzglService;
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
@RequestMapping("/zzgl")
public class ZzglController {

    @Resource
    private ZzglService zzglService;

    @RequestMapping("/findPage")
    @ResponseBody
    public PageResult query(int page, int size) {
        return zzglService.findZzgl(page, size);
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result add(ZzglPo zzglPo) {
        try {
            if (null != zzglService.selectByEarNum(zzglPo.getEarNumber())) {
                return new Result(false, "添加失败");
            } else {
                zzglService.addZzgl(zzglPo);
                return new Result(true, "添加成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "添加失败");
        }
    }
    @RequestMapping("/updateById")
    @ResponseBody
    public Result updateById(ZzglPo zzglPo) {
        System.out.println(zzglPo);
        try {
            zzglService.update(zzglPo);
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

    @RequestMapping("/selectById")
    @ResponseBody
    public ZzglPo selectById(int id) {
        ZzglPo zzglPo = zzglService.findOne(id);
        return zzglPo;
    }


    @RequestMapping("/deleteById")
    @ResponseBody
    public Result deleteById(Integer id) {
        //System.out.println(id);
        try {
            zzglService.deleteById(id);
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
            zzglService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    @RequestMapping("/searchByExample")
    @ResponseBody
    public PageResult query(@RequestBody ZzglPo zzglPo, int page, int size) {
        return zzglService.findZzgl(zzglPo, page, size);
    }




}
