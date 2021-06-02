package com.shoppingpermission.permission.modules.ums.dto;

import lombok.Data;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * @program: shopping-permission
 * @description: 用户参数
 * @author: Gauss
 * @date: 2021-06-02 11:24
 **/
@Data
public class UmsAdminParam {
    @NotEmpty
    private String username;        //用户名
    @NotEmpty
    private String password;        //密码
    private String icon;            //用户头像
    @Email
    private String email;           //邮箱
    private String nickName;        //用户昵称
    private String note;            //备注
}
