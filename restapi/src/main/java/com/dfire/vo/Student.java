package com.dfire.vo;

import lombok.Data;

/**
 *
 * @author xiaosuda
 * @date 2017/12/18
 */
@Data
public class Student extends Person {

    private Integer age;
    private String name;
    /**
     *  查看序列化源码可知：
     *  由于此字段与父类字段一样，在反序列化时会被父类的null值所覆盖，最终导致为null
     */
    private String sex;
}
