package com.solar.framework.core.base;

import com.solar.framework.core.enums.ServiceCode;
import com.solar.framework.core.enums.SourceCode;
import com.solar.framework.core.utils.SystemUtils;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public abstract class AbstractRequest extends AbstractModel {
    private ServiceCode service;
    private SourceCode source;
    private String localIp = SystemUtils.getLocalIp();
    private String hostName = SystemUtils.getHostName();

    public AbstractRequest() {
    }

    public String getLocalIp() {
        return this.localIp;
    }

    public void setLocalIp(String localIp) {
        this.localIp = localIp;
    }

    public String getHostName() {
        return this.hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ServiceCode getService() {
        return this.service;
    }

    public void setService(ServiceCode service) {
        this.service = service;
    }

    public SourceCode getSource() {
        return this.source;
    }

    public void setSource(SourceCode source) {
        this.source = source;
    }
}