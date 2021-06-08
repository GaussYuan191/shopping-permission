package com.shoppingpermission.permission.modules.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shoppingpermission.permission.modules.oms.mapper.OmsOrderMapper;
import com.shoppingpermission.permission.modules.oms.model.OmsOrder;
import com.shoppingpermission.permission.modules.oms.service.OmsOrderService;
import com.shoppingpermission.permission.modules.pms.mapper.PmsProductMapper;
import com.shoppingpermission.permission.modules.pms.model.PmsProduct;
import com.shoppingpermission.permission.modules.pms.service.PmsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopping-permission
 * @description: 商品Service实现
 * @author: Gauss
 * @date: 2021-06-07 21:55
 **/
@Service
public class PmsProductServiceImpl extends ServiceImpl<PmsProductMapper, PmsProduct> implements PmsProductService {

    @Autowired
    PmsProductMapper productMapper;

    @Override
    public List<PmsProduct> detail(){
        return productMapper.getProductList();
    }

    @Override
    public boolean addProduct(PmsProduct pmsProduct) {
        Integer flag = productMapper.insert(pmsProduct);
        System.out.println("商品添加的结果"+ flag);
        return true;
    }

}