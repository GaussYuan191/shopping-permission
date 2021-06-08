package com.shoppingpermission.permission.modules.oms.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: shopping-permission
 * @description: 订单信息
 * @author: Gauss
 * @date: 2021-06-07 12:16
 **/
@Data
@TableName("oms_order")
public class OmsOrder implements Serializable {
    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;                  //用户ID
    private String orderSn;          //订单编号
    private Date createTime;         //提交时间
    private String memberUsername;     //用户账号
    private Integer totalAmount;     //订单总金额
    private Integer payType;         //支付方式：0->未支付；1->支付宝；2->微信
    private Integer sourceType;      //订单来源：0->PC订单；1->app订单
    private Integer status;           //订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单

}
