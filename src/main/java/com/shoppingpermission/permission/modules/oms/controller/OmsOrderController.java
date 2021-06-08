package com.shoppingpermission.permission.modules.oms.controller;

import com.shoppingpermission.permission.common.api.CommonResult;
import com.shoppingpermission.permission.modules.oms.model.OmsOrder;
import com.shoppingpermission.permission.modules.oms.service.OmsOrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: shopping-permission
 * @description: 订单管理Controller
 * @author: Gauss
 * @date: 2021-06-07 12:01
 **/
@Controller
@RequestMapping("/order")
public class OmsOrderController {

    @Autowired
    OmsOrderService orderService;

    @RequestMapping("/list")
    @ResponseBody
    public CommonResult list(){
        List<OmsOrder> orderList= orderService.detail();

        if (orderList == null) {
            return CommonResult.failed();
        }
        System.out.println(CommonResult.success(orderList).getData());
        return CommonResult.success(orderList);
    }
}
