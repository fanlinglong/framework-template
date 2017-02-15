package com.solar.framework.core.exception;

import com.solar.framework.core.base.BaseException;
import com.solar.framework.core.enums.BizCode;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public class ValidateException extends BaseException {
    public ValidateException() {
    }

    public ValidateException(BizCode code) {
        super(code);
    }

    public ValidateException(BizCode code, String message) {
        super(code, message);
    }

    public ValidateException(BizCode code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public ValidateException(BizCode code, Throwable cause) {
        super(code, cause);
    }
}