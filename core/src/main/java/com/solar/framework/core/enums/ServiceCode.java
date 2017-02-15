package com.solar.framework.core.enums;

import com.solar.framework.core.base.AbstractCodedEnum;
import com.solar.framework.core.base.AbstractEnum;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public class ServiceCode extends AbstractCodedEnum {
    public static final ServiceCode Default = new ServiceCode("Default", "000", "默认");

    public ServiceCode() {
    }

    public ServiceCode(String name, String code, String desc) {
        super(name, code, desc);
    }

    protected Class<? extends AbstractEnum> getEnumType() {
        return ServiceCode.class;
    }
}
