package com.shoppingpermission.permission.modules.oms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shoppingpermission.permission.modules.oms.model.OmsOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: shopping-permission
 * @description:
 * @author: Gauss
 * @date: 2021-06-07 12:59
 **/
@Mapper
public interface OmsOrderMapper  extends BaseMapper<OmsOrder>  {
    List<OmsOrder> getOrderList();

}
