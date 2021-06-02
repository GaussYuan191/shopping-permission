package com.shoppingpermission.permission.common.exception;

import com.shoppingpermission.permission.common.api.IErrorCode;

/**
 * @program: shopping-permission
 * @description: 自定义API异常
 * @author: Gauss
 * @date: 2021-06-02 14:25
 **/
public class ApiException extends RuntimeException {
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
