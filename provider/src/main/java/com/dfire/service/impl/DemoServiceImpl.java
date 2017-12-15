package com.dfire.service.impl;

import com.dfire.service.DemoService;
import org.springframework.stereotype.Service;

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
}
