package com.shoppingpermission.permission.modules.ums.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * @program: shopping-permission
 * @description: 后台用户表
 * @author: Gauss
 * @date: 2021-06-01 08:54
 **/
@Data
@TableName("ums_admin")
public class UmsAdmin implements Serializable {
    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;                  //用户ID
    private String username;          // 用户名
    private String password;          //密码
    private String icon;              //图标
    private String email;             //邮箱
    private String nickName;          //昵称
    private String note;              //备注信息
    private Date createTime;          //用户创建的时间
    private Date loginTime;           //最后登录的时间
    private Integer status;           //用户的状态码 0 => 禁用 1 => 启用
}
