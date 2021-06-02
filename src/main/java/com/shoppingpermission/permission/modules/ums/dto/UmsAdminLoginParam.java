package com.shoppingpermission.permission.modules.ums.dto;

import lombok.Data;
import javax.validation.constraints.NotEmpty;

/**
 * @program: shopping-permission
 * @description: 用户登录参数
 * @author: Gauss
 * @date: 2021-06-02 11:27
 **/
@Data
public class UmsAdminLoginParam {
    @NotEmpty
    private String username;      //用户名
    @NotEmpty
    private String password;      //密码
}
