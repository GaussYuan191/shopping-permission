package com.shoppingpermission.permission.modules.ums.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: shopping-permission
 * @description: 资源分配表
 * @author: Gauss
 * @date: 2021-06-02 16:08
 **/
@Data
@TableName("ums_resource_category")
public class UmsResourceCategory implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private Date createTime;       //创建时间
    private String name;           //分类名称
    private Integer sort;          //排序


}
