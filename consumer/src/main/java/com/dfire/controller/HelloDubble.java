package com.dfire.controller;

import com.dfire.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author xiaosuda
 * @date 2017/12/15
 */
@Controller
@RequestMapping("hello/")
public class HelloDubble {
    @Autowired
    private DemoService demoService;
    @RequestMapping("dubbo")
    @ResponseBody
    public String sayHello() {
        String s = demoService.sayHello("Dubbo学习之路");
        return s;
    }

    @RequestMapping("allStudents")
    @ResponseBody
    public Object getAllStudents() {
        Long start = System.currentTimeMillis();
        System.out.println(demoService.getAllStudents().size());
        Long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
        return "success";
    }
}
