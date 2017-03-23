package com.demo;

import org.springframework.context.support.ApplicationObjectSupport;

/**
 * Created by Administrator on 2017-02-13.
 */
public class MyApplicationObjectSupport extends ApplicationObjectSupport {
    //提供一个接口，获取容器中的Bean实例，根据名称获取
    public Object getBean(String beanName)
    {
        return getApplicationContext().getBean(beanName);
    }
}
