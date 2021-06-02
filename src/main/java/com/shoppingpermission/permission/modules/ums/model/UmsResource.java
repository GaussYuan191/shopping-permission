package com.shoppingpermission.permission.modules.ums.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


import java.io.Serializable;
import java.util.Date;

/**
 * @program: shopping-permission
 * @description: 后台资源表
 * @author: Gauss
 * @date: 2021-06-02 11:37
 **/
@Data
@TableName("ums_resource")
public class UmsResource implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private Date createTime;      //创建的时间
    private String name;          //资源名称
    private String url;           //资源URL
    private String description;   //描述
    private Long categoryId;      //资源分类ID


}
