package com.shoppingpermission.permission.modules.ums.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


import java.io.Serializable;
import java.util.Date;

/**
 * @program: shopping-permission
 * @description: 后台用户角色表
 * @author: Gauss
 * @date: 2021-06-01 11:00
 **/
@Data
@TableName("ums_role")
public class UmsRole implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)

    private Long id;                      //角色ID
    private String name;                  //名称
    private String description;           //描述
    private Integer adminCount;           //后台用户数量
    private Date createTime;              //创建时间
    private Integer status;               //启用状态
    private Integer sort;


}

