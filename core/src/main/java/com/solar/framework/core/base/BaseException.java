package com.solar.framework.core.base;

import com.solar.framework.core.enums.BizCode;

import java.io.Serializable;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public abstract class BaseException extends RuntimeException implements Serializable {
    private BizCode code;

    public BaseException() {
        this.code = BizCode.Unknown;
    }

    public BaseException(BizCode code) {
        this.code = BizCode.Unknown;
        this.code = code;
    }

    public BaseException(BizCode code, String message) {
        super(message);
        this.code = BizCode.Unknown;
        this.code = code;
    }

    public BaseException(BizCode code, String message, Throwable cause) {
        super(message, cause);
        this.code = BizCode.Unknown;
        this.code = code;
    }

    public BaseException(BizCode code, Throwable cause) {
        super(cause);
        this.code = BizCode.Unknown;
        this.code = code;
    }

    public BizCode getCode() {
        return this.code;
    }

    public void setCode(BizCode code) {
        this.code = code;
    }
}