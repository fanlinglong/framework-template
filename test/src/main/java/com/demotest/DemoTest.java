package com.demotest;

import com.demo.MyApplicationObjectSupport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017-02-13.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring/demo-service.xml")
public class DemoTest {

//    @Resource(name = "defaultDateFormat")
//    private SimpleDateFormat simpleDateFormat;

    @Resource(name = "myApplicationObjectSupport")
    private MyApplicationObjectSupport application;

    @Test
    public void sayHello() {
        System.out.println("aaa");
//        System.out.println(simpleDateFormat.format(new Date()));
        ApplicationContext context = application.getApplicationContext();
        System.out.println(context);
        SimpleDateFormat bean = context.getBean("dateFormat", SimpleDateFormat.class);
        System.out.println(bean.format(new Date()));
        SimpleDateFormat bean2 = context.getBean("defaultDateFormat", SimpleDateFormat.class);
        System.out.println(bean2.format(new Date()));
    }
}
