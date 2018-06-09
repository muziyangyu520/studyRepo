package com.li.hello.common.diyAnnotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @Package:
 * @Description: 定制一个接口
 * @author:
 * @date:
 */
@Documented
@Retention(RUNTIME)
@Target(METHOD)
public @interface LogAspectAnnotation {
    String value() default "日志注解";
}
