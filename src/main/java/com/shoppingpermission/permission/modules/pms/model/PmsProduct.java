package com.shoppingpermission.permission.modules.pms.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: shopping-permission
 * @description: 商品
 * @author: Gauss
 * @date: 2021-06-07 21:42
 **/
@Data
@TableName("pms_product")
public class PmsProduct implements Serializable {
    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;                  //用户ID
    private String pic;               //图片地址
    private String name;              //商品名
    private String brandName;         //品牌名称
    private Integer price;            //价格
    private String productSn;         //货号
    private Integer sale;             //销量
    private Integer nums;             //商品的数量
    private Date createTime;          //添加时间

}
