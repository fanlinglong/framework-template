package com.solar.framework.template.spring;

import com.solar.framework.core.enums.BizCode;
import com.solar.framework.template.Action;
import com.solar.framework.template.Manager;
import com.solar.framework.template.Processor;
import com.solar.framework.template.common.TemplateException;
import com.solar.framework.template.spring.support.SpringHoldTemplateManager;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.beans.factory.xml.AbstractBeanDefinitionParser;
import org.springframework.beans.factory.xml.BeanDefinitionParserDelegate;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

import java.util.Iterator;
import java.util.List;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public class TemplateBeanDefinitionParser extends AbstractBeanDefinitionParser {
    private static final String NODE_PROCESSOR = "processor";
    private static final String NODE_ACTION = "action";
    private static final String ATTR_REF = "ref";
    private static final String ATTR_NAME = "name";
    private Class<?> beanClass = null;

    public TemplateBeanDefinitionParser(Class<?> clazz) {
        this.beanClass = clazz;
    }

    protected AbstractBeanDefinition parseInternal(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition();
        Object source = parserContext.extractSource(element);
        builder.getRawBeanDefinition().setBeanClass(this.getBeanClass());
        builder.getRawBeanDefinition().setSource(source);
        return Manager.class.isAssignableFrom(this.getBeanClass())?this.doParseManager(element, parserContext, builder):(Processor.class.isAssignableFrom(this.getBeanClass())?this.doParseProcessor(element, parserContext, builder):(Action.class.isAssignableFrom(this.getBeanClass())?this.doParseAction(element, parserContext, builder):null));
    }

    private AbstractBeanDefinition doParseAction(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
        String ref = element.getAttribute("ref");
        if(StringUtils.isBlank(ref)) {
            throw new TemplateException(BizCode.ParamNull, "动作执行器不能为空");
        } else {
            builder.addPropertyReference("action", ref);
            return builder.getBeanDefinition();
        }
    }

    private AbstractBeanDefinition doParseProcessor(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
        String name = element.getAttribute("name");
        if(StringUtils.isBlank(name)) {
            throw new TemplateException(BizCode.ParamNull, "处理器名称不能为空");
        } else {
            builder.addPropertyValue("name", name);
            List actions = this.getAllAction(element, parserContext, builder.getRawBeanDefinition());
            builder.addPropertyValue("actions", actions);
            return builder.getBeanDefinition();
        }
    }

    private AbstractBeanDefinition doParseManager(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
        if(element.hasAttribute("ref")) {
            String processors = element.getAttribute("ref");
            builder.getRawBeanDefinition().setBeanClass(SpringHoldTemplateManager.class);
            builder.addPropertyReference("manager", processors);
        }

        List processors1 = this.getAllProcessor(element, parserContext, builder.getRawBeanDefinition());
        builder.addPropertyValue("processors", processors1);
        return builder.getBeanDefinition();
    }

    private List<Object> getAllProcessor(Element element, ParserContext parserContext, AbstractBeanDefinition parentBeanDefinition) {
        BeanDefinitionParserDelegate delegate = parserContext.getDelegate();
        ManagedList processorBeans = new ManagedList(6);
        List children = DomUtils.getChildElements(element);
        Iterator var7 = children.iterator();

        while(var7.hasNext()) {
            Element child = (Element)var7.next();
            if("processor".equals(child.getLocalName())) {
                Object object = delegate.parsePropertySubElement(child, parentBeanDefinition);
                processorBeans.add(object);
            }
        }

        return processorBeans;
    }

    private List<Object> getAllAction(Element element, ParserContext parserContext, AbstractBeanDefinition parentBeanDefinition) {
        BeanDefinitionParserDelegate delegate = parserContext.getDelegate();
        ManagedList actionBeans = new ManagedList(6);
        List children = DomUtils.getChildElements(element);
        Iterator var7 = children.iterator();

        while(var7.hasNext()) {
            Element child = (Element)var7.next();
            if("action".equals(child.getLocalName())) {
                Object object = delegate.parsePropertySubElement(child, parentBeanDefinition);
                actionBeans.add(object);
            }
        }

        return actionBeans;
    }

    public Class<?> getBeanClass() {
        return this.beanClass;
    }
}
