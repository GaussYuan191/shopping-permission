package com.shoppingpermission.permission.modules.ums.dto;


import lombok.Data;
import javax.validation.constraints.NotEmpty;

/**
 * @program: shopping-permission
 * @description: 修改用户名密码参数
 * @author: Gauss
 * @date: 2021-06-02 11:25
 **/
@Data
public class UpdateAdminPasswordParam {
    @NotEmpty
    private String username;         //用户名
    @NotEmpty
    private String oldPassword;      //旧密码
    @NotEmpty
    private String newPassword;      //新密码
}

