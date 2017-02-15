package com.solar.framework.template;

import com.solar.framework.core.base.AbstractRequest;
import com.solar.framework.core.base.AbstractResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public class ActionContext {
    private AbstractRequest request;
    private AbstractResponse response;
    private Map<String, Object> params = new HashMap();
    private static ThreadLocal<ActionContext> CONTEXT = new ThreadLocal() {
        protected ActionContext initialValue() {
            return new ActionContext();
        }
    };

    public ActionContext() {
    }

    public static ActionContext getContext() {
        return (ActionContext)CONTEXT.get();
    }

    public static void remove() {
        CONTEXT.remove();
    }

    public void put(String key, Object object) {
        this.params.put(key, object);
    }

    public Object get(String key) {
        return this.params.get(key);
    }

    public AbstractRequest getRequest() {
        return this.request;
    }

    public void setRequest(AbstractRequest request) {
        this.request = request;
    }

    public AbstractResponse getResponse() {
        return this.response;
    }

    public void setResponse(AbstractResponse response) {
        this.response = response;
    }
}