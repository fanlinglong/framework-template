package com.solar.framework.core.exception;

import com.solar.framework.core.base.BaseException;
import com.solar.framework.core.enums.BizCode;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public class BizException extends BaseException {
    public BizException() {
    }

    public BizException(BizCode code) {
        super(code);
    }

    public BizException(BizCode code, String message) {
        super(code, message);
    }

    public BizException(BizCode code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public BizException(BizCode code, Throwable cause) {
        super(code, cause);
    }
}