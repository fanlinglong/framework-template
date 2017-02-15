package com.solar.framework.biz.template.service.impl;

import com.solar.framework.core.base.BaseException;
import com.solar.framework.core.enums.BizCode;
import com.solar.framework.template.ActionContext;
import com.solar.framework.template.Manager;
import com.solar.framework.template.Processor;
import com.solar.framework.biz.template.facade.LoginService;
import com.solar.framework.biz.template.facade.model.LoginRequest;
import com.solar.framework.biz.template.facade.model.LoginResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by fanlinlong on 2017/2/8.
 */
@Service
public class LoginServiceImpl implements LoginService {
    private Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

    @Resource(name = "test.LoginService")
    private Manager manager;

    @Override
    public LoginResponse login(LoginRequest request) {
        logger.info("登录开始{}:",request);
        LoginResponse response = new LoginResponse();
        ActionContext actionContext = ActionContext.getContext();
        try {
            actionContext.setRequest(request);
            actionContext.setResponse(response);
            Processor processor = manager.getProcessor("login");
            processor.process();
            response.setCode(BizCode.Success);
            response.setMessage("登录成功");
        }catch (BaseException e){
            logger.error("登录失败",e);
            response.setCode(e.getCode());
            response.setMessage(e.getMessage());
        }catch (Exception e){
            logger.error("登录失败",e);
            response.setCode(BizCode.Unknown);
            response.setMessage(e.getMessage());
        }finally {
            ActionContext.remove();
        }
        logger.info("登录成功{}:",request);
        return response;
    }
}
