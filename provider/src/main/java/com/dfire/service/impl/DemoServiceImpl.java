package com.dfire.service.impl;

import com.alibaba.com.caucho.hessian.io.Hessian2Input;
import com.alibaba.com.caucho.hessian.io.Hessian2Output;
import com.dfire.service.DemoService;
import com.dfire.vo.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author xiaosuda
 * @date 2017/12/14
 */
@Service("demoServiceImpl")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "你说：" + name;
    }

    @Override
    public Map<String, Student> getAllStudents() {
        Random r = new Random();
        Map<String, Student> res = new HashMap<>(10);
        for (int i = 0; i < 100000; i++) {
            Student stu = new Student();
            stu.setAge(r.nextInt(10) + 10);
            stu.setName("name:" + i);
            stu.setSex("男");
            res.put(stu.getName(), stu);
        }
        return res;
    }
}
