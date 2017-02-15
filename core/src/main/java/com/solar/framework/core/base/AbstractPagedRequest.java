package com.solar.framework.core.base;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public abstract class AbstractPagedRequest extends AbstractRequest {
    private Integer pageNo;
    private Integer pageSize;

    public AbstractPagedRequest() {
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}