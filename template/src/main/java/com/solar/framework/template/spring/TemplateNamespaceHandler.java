package com.solar.framework.template.spring;

import com.solar.framework.template.spring.support.SpringHoldAction;
import com.solar.framework.template.support.TemplateManager;
import com.solar.framework.template.support.TemplateProcessor;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public class TemplateNamespaceHandler extends NamespaceHandlerSupport {
    public TemplateNamespaceHandler() {
    }

    public void init() {
        this.registerBeanDefinitionParser("manager", new TemplateBeanDefinitionParser(TemplateManager.class));
        this.registerBeanDefinitionParser("processor", new TemplateBeanDefinitionParser(TemplateProcessor.class));
        this.registerBeanDefinitionParser("action", new TemplateBeanDefinitionParser(SpringHoldAction.class));
    }
}