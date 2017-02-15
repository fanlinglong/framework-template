package com.solar.framework.biz.template.service.impl;

import com.solar.framework.biz.template.facade.LoginService;
import com.solar.framework.biz.template.facade.model.LoginRequest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

/**
 * Created by fanlinlong on 2017/2/8.
 */
@ContextConfiguration(locations = "classpath:spring/test-service.xml")
public class LoginServiceImplTest extends AbstractJUnit4SpringContextTests {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private LoginService loginService;

    @Test
    public void testLogin() {
        logger.debug("123");
        logger.info("123");
        LoginRequest request = new LoginRequest();
        loginService.login(request);
    }

}