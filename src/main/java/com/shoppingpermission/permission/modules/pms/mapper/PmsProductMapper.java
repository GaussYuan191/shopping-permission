package com.shoppingpermission.permission.modules.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shoppingpermission.permission.modules.pms.model.PmsProduct;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shopping-permission
 * @description: 商品Mapper
 * @author: Gauss
 * @date: 2021-06-07 21:50
 **/
@Mapper
public interface PmsProductMapper extends BaseMapper<PmsProduct> {
    List<PmsProduct> getProductList();

//   Integer add(PmsProduct pmsProduct);

}
