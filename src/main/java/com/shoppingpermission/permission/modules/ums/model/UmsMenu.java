package com.shoppingpermission.permission.modules.ums.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: shopping-permission
 * @description: 后台菜单表
 * @author: Gauss
 * @date: 2021-06-02 11:04
 **/
@Data
@TableName("ums_menu")
public class UmsMenu implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private Long parentId;            //父级ID
    private Date createTime;          //创建时间
    private String title;             //菜单名称
    private Integer level;            //菜单级数
    private Integer sort;             //菜单排序
    private String name;              //前端名称
    private String icon;              //前端图标
    private Integer hidden;           //前端隐藏


}
