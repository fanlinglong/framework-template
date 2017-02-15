package com.solar.framework.core.enums;

import com.solar.framework.core.base.AbstractCodedEnum;
import com.solar.framework.core.base.AbstractEnum;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public class BizCode extends AbstractCodedEnum {
    public static final BizCode Success;
    public static final BizCode ParamNull;
    public static final BizCode ParamError;
    public static final BizCode ParamNotDigital;
    public static final BizCode ParamGT0;
    public static final BizCode ParamLT0;
    public static final BizCode ParamEmpty;
    public static final BizCode DataNotExist;
    public static final BizCode DataIsExist;
    public static final BizCode DBError;
    public static final BizCode DuplicateOperation;
    public static final BizCode SerializationException;
    public static final BizCode InstantiationError;
    public static final BizCode ClassCastError;
    public static final BizCode Unknown;
    private ServiceCode serviceCode;

    public BizCode() {
    }

    public BizCode(String name, String code, ServiceCode serviceCode, String desc) {
        super(serviceCode.name() + "#" + name, serviceCode.code() + code, desc);
        this.serviceCode = serviceCode;
    }

    protected Class<? extends AbstractEnum> getEnumType() {
        return BizCode.class;
    }

    public ServiceCode getServiceCode() {
        return this.serviceCode;
    }

    static {
        Success = new BizCode("Success", "000", ServiceCode.Default, "成功");
        ParamNull = new BizCode("ParamNull", "001", ServiceCode.Default, "参数为空");
        ParamError = new BizCode("ParamError", "002", ServiceCode.Default, "参数错误");
        ParamNotDigital = new BizCode("ParamNotDigital", "003", ServiceCode.Default, "参数非数字");
        ParamGT0 = new BizCode("ParamGT0", "004", ServiceCode.Default, "参数大于0");
        ParamLT0 = new BizCode("ParamLT0", "005", ServiceCode.Default, "参数小于0");
        ParamEmpty = new BizCode("ParamEmpty", "006", ServiceCode.Default, "参数为空");
        DataNotExist = new BizCode("DataNotExist", "100", ServiceCode.Default, "数据不存在");
        DataIsExist = new BizCode("DataIsExist", "101", ServiceCode.Default, "数据已存在");
        DBError = new BizCode("DBError", "102", ServiceCode.Default, "数据异常");
        DuplicateOperation = new BizCode("DuplicateOperation", "200", ServiceCode.Default, "重复操作");
        SerializationException = new BizCode("SerializationException", "201", ServiceCode.Default, "序列化操作异常");
        InstantiationError = new BizCode("InstantiationError", "202", ServiceCode.Default, "实例化异常");
        ClassCastError = new BizCode("ClassCastError", "203", ServiceCode.Default, "类型转换异常");
        Unknown = new BizCode("Unknown", "999", ServiceCode.Default, "网络异常");
    }
}