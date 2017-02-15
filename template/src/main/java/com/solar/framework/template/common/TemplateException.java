package com.solar.framework.template.common;

import com.solar.framework.core.base.BaseException;
import com.solar.framework.core.enums.BizCode;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public class TemplateException extends BaseException {
    public TemplateException() {
    }

    public TemplateException(BizCode code) {
        super(code);
    }

    public TemplateException(BizCode code, String message) {
        super(code, message);
    }

    public TemplateException(BizCode code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public TemplateException(BizCode code, Throwable cause) {
        super(code, cause);
    }
}