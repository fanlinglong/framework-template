package com.solar.framework.biz.template.service.action;

import com.solar.framework.core.base.AbstractRequest;
import com.solar.framework.core.base.AbstractResponse;
import com.solar.framework.template.support.AbstractAction;
import org.springframework.stereotype.Component;

/**
 * Created by fanlinlong on 2017/2/8.
 */
@Component("test.UserPrepareAction")
public class UserPrepareAction extends AbstractAction {
    @Override
    protected boolean doPerform(AbstractRequest abstractRequest, AbstractResponse abstractResponse) {

        prepare(abstractRequest);

        return true;
    }

    protected void prepare(AbstractRequest abstractRequest){

    }
}
