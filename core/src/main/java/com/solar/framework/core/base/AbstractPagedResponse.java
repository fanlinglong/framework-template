package com.solar.framework.core.base;

import java.util.List;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public abstract class AbstractPagedResponse<T> extends AbstractResponse {
    private Integer total;
    private List<T> datas;

    public AbstractPagedResponse() {
    }

    public Integer getTotal() {
        return this.total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getDatas() {
        return this.datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }
}
