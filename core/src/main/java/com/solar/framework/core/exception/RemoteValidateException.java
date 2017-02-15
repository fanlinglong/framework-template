package com.solar.framework.core.exception;

import com.solar.framework.core.enums.BizCode;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public class RemoteValidateException extends ValidateException {
    public RemoteValidateException() {
    }

    public RemoteValidateException(BizCode code) {
        super(code);
    }

    public RemoteValidateException(BizCode code, String message) {
        super(code, message);
    }

    public RemoteValidateException(BizCode code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public RemoteValidateException(BizCode code, Throwable cause) {
        super(code, cause);
    }
}