package com.shoppingpermission.permission.modules.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shoppingpermission.permission.modules.oms.model.OmsOrder;
import com.shoppingpermission.permission.modules.ums.model.UmsMenu;

import java.util.List;

/**
 * @program: shopping-permission
 * @description: 订单管理Service
 * @author: Gauss
 * @date: 2021-06-07 12:02
 **/
public interface OmsOrderService extends IService<OmsOrder> {
    /**
     * 获取订单详情
     */
    List<OmsOrder> detail();
}
