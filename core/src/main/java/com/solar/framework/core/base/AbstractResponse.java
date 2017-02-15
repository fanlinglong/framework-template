package com.solar.framework.core.base;

import com.solar.framework.core.enums.BizCode;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public abstract class AbstractResponse extends AbstractModel {
    private BizCode code;
    private String message;

    public AbstractResponse() {
    }

    public boolean isSuccess() {
        return BizCode.Success == this.code;
    }

    public BizCode getCode() {
        return this.code;
    }

    public void setCode(BizCode code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
