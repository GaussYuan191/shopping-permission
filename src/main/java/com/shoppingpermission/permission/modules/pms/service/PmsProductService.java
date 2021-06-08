package com.shoppingpermission.permission.modules.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shoppingpermission.permission.modules.oms.model.OmsOrder;
import com.shoppingpermission.permission.modules.pms.model.PmsProduct;

import java.util.List;

/**
 * @program: shopping-permission
 * @description: 商品Service
 * @author: Gauss
 * @date: 2021-06-07 21:52
 **/
public interface PmsProductService extends IService<PmsProduct> {
    /**
     * 获取商品详情
     */
    List<PmsProduct> detail();
    boolean addProduct(PmsProduct pmsProduct);
}
