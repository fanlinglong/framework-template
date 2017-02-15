package com.solar.framework.template.spring.support;

import com.solar.framework.core.enums.BizCode;
import com.solar.framework.template.Action;
import com.solar.framework.template.common.TemplateException;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public class SpringHoldAction implements Action, InitializingBean {
    private Action action;

    public SpringHoldAction() {
    }

    public boolean perform() {
        return this.action.perform();
    }

    public Action getAction() {
        return this.action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public void afterPropertiesSet() throws Exception {
        if(this.action == null) {
            throw new TemplateException(BizCode.ParamNull, "Action 执行类不能为空");
        }
    }
}