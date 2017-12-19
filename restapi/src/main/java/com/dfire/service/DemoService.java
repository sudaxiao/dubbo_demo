package com.dfire.service;

import com.dfire.vo.Student;

import java.util.Map;

/**
 * @author xiaosuda
 * @date 2017/12/14
 */
public interface DemoService {

    String sayHello(String name);

    Map<String, Student> getAllStudents();
}
