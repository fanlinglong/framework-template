package com.solar.framework.core.annotation;

import java.lang.annotation.*;

/**
 * Created by fanlinlong on 2017/2/8.
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FieldIgnore {
}