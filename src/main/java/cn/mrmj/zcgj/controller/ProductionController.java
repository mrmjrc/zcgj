package cn.mrmj.zcgj.controller;



import cn.mrmj.zcgj.dto.PageResult;
import cn.mrmj.zcgj.dto.Result;
import cn.mrmj.zcgj.po.ProductionPo;
import cn.mrmj.zcgj.service.ProductionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @description: 生产 Controller
 * @author: 稚生
 * @date: 2019/4/12 15:18
 * @version: V1.0
 */
@Controller
@RequestMapping("/product")
public class ProductionController {

    @Resource
    private ProductionService productionService;

    @RequestMapping("/findPage")
    @ResponseBody
    public PageResult query(int page, int size) {
        return productionService.findProduction(page, size);
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result add(ProductionPo productionPo) {
        try {
            if (null != productionService.selectByEarNum(productionPo.getEarNumber())) {
                return new Result(false, "添加失败");
            } else {
                productionService.addProduction(productionPo);
                return new Result(true, "添加成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "添加失败");
        }
    }
    @RequestMapping("/updateById")
    @ResponseBody
    public Result updateById(ProductionPo productionPo) {
        try {
            productionService.update(productionPo);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }


    @RequestMapping("/selectByEarNum")
    @ResponseBody
    public Result selectByEarNum(String earNumber){
        ProductionPo productionPo= productionService.selectByEarNum(earNumber);
        if (productionPo != null) {
            return new Result(true, "耳号已存在");
        } else {
            return new Result(false, "正常");
        }
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public ProductionPo selectById(int id) {
        return productionService.findOne(id);

    }


    @RequestMapping("/deleteById")
    @ResponseBody
    public Result deleteById(Integer id) {
        //System.out.println(id);
        try {
            productionService.deleteById(id);
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
            productionService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    @RequestMapping("/searchByExample")
    @ResponseBody
    public PageResult query(@RequestBody ProductionPo productionPo, int page, int size) {
        return productionService.findProduction(productionPo, page, size);
    }




}
