package com.shoppingpermission.permission.modules.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shoppingpermission.permission.modules.oms.mapper.OmsOrderMapper;
import com.shoppingpermission.permission.modules.oms.model.OmsOrder;
import com.shoppingpermission.permission.modules.oms.service.OmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopping-permission
 * @description: 订单管理Service
 * @author: Gauss
 * @date: 2021-06-07 13:16
 **/
@Service
public class OmsOrderServiceImpl  extends ServiceImpl<OmsOrderMapper, OmsOrder> implements OmsOrderService {

    @Autowired
    OmsOrderMapper orderMapper;

    @Override
    public List<OmsOrder> detail(){
        return orderMapper.getOrderList();
    }

}
