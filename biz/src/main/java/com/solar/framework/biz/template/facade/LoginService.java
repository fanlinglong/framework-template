package com.solar.framework.biz.template.facade;

import com.solar.framework.biz.template.facade.model.LoginRequest;
import com.solar.framework.biz.template.facade.model.LoginResponse;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public interface LoginService {
    /**
     * 用户登录
     * @param request
     * @return
     */
    public LoginResponse login(LoginRequest request);
}
