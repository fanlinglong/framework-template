package com.solar.framework.core.exception;

import com.solar.framework.core.base.BaseException;
import com.solar.framework.core.enums.BizCode;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public class RemoteException extends BaseException {
    public RemoteException() {
    }

    public RemoteException(BizCode code) {
        super(code);
    }

    public RemoteException(BizCode code, String message) {
        super(code, message);
    }

    public RemoteException(BizCode code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public RemoteException(BizCode code, Throwable cause) {
        super(code, cause);
    }
}