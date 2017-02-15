package com.solar.framework.template.support;

import com.solar.framework.core.base.AbstractRequest;
import com.solar.framework.core.base.AbstractResponse;
import com.solar.framework.template.Action;
import com.solar.framework.template.ActionContext;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public abstract class AbstractAction implements Action {
    public AbstractAction() {
    }

    public boolean perform() {
        ActionContext context = ActionContext.getContext();
        AbstractRequest request = context.getRequest();
        AbstractResponse response = context.getResponse();
        return this.doPerform(request, response);
    }

    protected abstract boolean doPerform(AbstractRequest var1, AbstractResponse var2);
}