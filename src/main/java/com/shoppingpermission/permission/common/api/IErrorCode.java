package com.shoppingpermission.permission.common.api;

/**
 * @program: shopping-permission
 * @description:  封装API的错误码
 * @author: Gauss
 * @date: 2021-06-02 14:24
 **/
public interface IErrorCode {
    long getCode();

    String getMessage();
}