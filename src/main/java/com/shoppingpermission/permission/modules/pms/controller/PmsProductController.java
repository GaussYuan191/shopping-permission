package com.shoppingpermission.permission.modules.pms.controller;

import com.shoppingpermission.permission.common.api.CommonPage;
import com.shoppingpermission.permission.common.api.CommonResult;
import com.shoppingpermission.permission.modules.pms.model.PmsProduct;
import com.shoppingpermission.permission.modules.pms.service.PmsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: shopping-permission
 * @description:  商品管理Controller
 * @author: Gauss
 * @date: 2021-06-07 16:24
 **/
@Controller
@RequestMapping("/product")
public class PmsProductController {

    @Autowired
    private PmsProductService productService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsProduct>>getList() {
        List<PmsProduct> productList = productService.list();
        if (productList == null) {
            return CommonResult.failed();
        }
        System.out.println(CommonResult.success(productList).getData());
        return CommonResult.success(productList);
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult add(@RequestBody PmsProduct pmsProduct) {
        System.out.println("前端提交的数据"+pmsProduct.toString());
        boolean success = productService.addProduct(pmsProduct);
        if (success) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed();
        }
    }

}
