package com.solar.framework.core.exception;

import com.solar.framework.core.base.BaseException;
import com.solar.framework.core.enums.BizCode;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public class NoRollbackException extends BaseException {
    public NoRollbackException() {
    }

    public NoRollbackException(BizCode code) {
        super(code);
    }

    public NoRollbackException(BizCode code, String message) {
        super(code, message);
    }

    public NoRollbackException(BizCode code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public NoRollbackException(BizCode code, Throwable cause) {
        super(code, cause);
    }
}