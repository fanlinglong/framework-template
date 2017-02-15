package com.solar.framework.template.support;

import com.solar.framework.core.enums.BizCode;
import com.solar.framework.template.Manager;
import com.solar.framework.template.Processor;
import com.solar.framework.template.common.TemplateException;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public class TemplateManager implements Manager {
    private static final Logger logger = LoggerFactory.getLogger(TemplateManager.class);
    private final Map<String, Processor> processorMap = new ConcurrentHashMap();

    public TemplateManager() {
    }

    public Processor getProcessor(String name) {
        if(!this.processorMap.containsKey(name)) {
            throw new TemplateException(BizCode.DataNotExist, name + "模板处理器不存在");
        } else {
            return (Processor)this.processorMap.get(name);
        }
    }

    public void setProcessors(List<Processor> processors) {
        if(!CollectionUtils.isEmpty(processors)) {
            Iterator var2 = processors.iterator();

            while(var2.hasNext()) {
                Processor processor = (Processor)var2.next();
                if(this.processorMap.containsKey(processor.getName())) {
                    throw new TemplateException(BizCode.DataIsExist, processor.getName() + "模板处理器已经存在");
                }

                logger.info("注册处理器:~~~~~~~~{}~~~~~~~~~", processor.getName());
                this.processorMap.put(processor.getName(), processor);
            }

        }
    }
}