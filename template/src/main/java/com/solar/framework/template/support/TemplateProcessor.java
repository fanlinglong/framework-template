package com.solar.framework.template.support;

import com.solar.framework.template.Action;
import com.solar.framework.template.Processor;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public class TemplateProcessor implements Processor {
    private String name;
    private List<Action> actions = new ArrayList();

    public TemplateProcessor() {
    }

    public String getName() {
        return this.name;
    }

    public void process() {
        boolean $continue = true;
        Iterator var2 = this.actions.iterator();

        do {
            if(!var2.hasNext()) {
                return;
            }

            Action action = (Action)var2.next();
            $continue = action.perform();
        } while($continue);

    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Action> getActions() {
        return this.actions;
    }

    public void setActions(List<Action> actions) {
        if(!CollectionUtils.isEmpty(actions)) {
            this.actions.addAll(actions);
        }
    }
}