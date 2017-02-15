package com.solar.framework.template;

import java.util.List;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public interface Manager {
    Processor getProcessor(String var1);

    void setProcessors(List<Processor> var1);
}
