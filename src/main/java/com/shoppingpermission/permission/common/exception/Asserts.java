package com.shoppingpermission.permission.common.exception;



import com.shoppingpermission.permission.common.api.IErrorCode;

/**
 * @program: shopping-permission
 * @description: 断言处理类，用于抛出各种API异常
 * @author: Gauss
 * @date: 2021-06-02 14:23
 **/
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}