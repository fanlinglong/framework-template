package com.solar.framework.core.exception;

import com.solar.framework.core.base.BaseException;
import com.solar.framework.core.enums.BizCode;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public class BizCheckException extends BaseException {
    public BizCheckException() {
    }

    public BizCheckException(BizCode code) {
        super(code);
    }

    public BizCheckException(BizCode code, String message) {
        super(code, message);
    }

    public BizCheckException(BizCode code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public BizCheckException(BizCode code, Throwable cause) {
        super(code, cause);
    }
}