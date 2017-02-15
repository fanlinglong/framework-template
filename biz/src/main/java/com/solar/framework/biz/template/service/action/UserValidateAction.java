package com.solar.framework.biz.template.service.action;

import com.solar.framework.core.base.AbstractRequest;
import com.solar.framework.core.base.AbstractResponse;
import com.solar.framework.template.support.AbstractAction;
import org.springframework.stereotype.Component;

/**
 * Created by fanlinlong on 2017/2/8.
 */
@Component("test.UserValidateAction")
public class UserValidateAction  extends AbstractAction {
    @Override
    protected boolean doPerform(AbstractRequest abstractRequest, AbstractResponse abstractResponse) {

        validate(abstractRequest);

        return true;
    }

    protected void validate(AbstractRequest abstractRequest){

    }
}