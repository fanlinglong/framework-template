package com.solar.framework.template.spring.support;

import com.solar.framework.core.enums.BizCode;
import com.solar.framework.template.Manager;
import com.solar.framework.template.Processor;
import com.solar.framework.template.common.TemplateException;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public class SpringHoldTemplateManager implements Manager, InitializingBean {
    private Manager manager;
    private List<Processor> processors;

    public SpringHoldTemplateManager() {
    }

    public Manager getManager() {
        return this.manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Processor getProcessor(String name) {
        return this.manager.getProcessor(name);
    }

    public List<Processor> getProcessors() {
        return this.processors;
    }

    public void setProcessors(List<Processor> processors) {
        this.processors = processors;
    }

    public void afterPropertiesSet() throws Exception {
        if(this.manager == null) {
            throw new TemplateException(BizCode.ParamNull, "处理管理器不能为空");
        } else {
            if(!CollectionUtils.isEmpty(this.processors)) {
                this.manager.setProcessors(this.processors);
            }

        }
    }
}
