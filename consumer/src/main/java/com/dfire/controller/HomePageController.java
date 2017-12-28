package com.dfire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *  页面中转控制器
 * @author xiaosuda
 * @date 2017/12/27
 */
@Controller
@RequestMapping("homepage/")
public class HomePageController {

    @RequestMapping(value = "{pageName}",method = RequestMethod.GET)
    public ModelAndView toPage(@PathVariable("pageName") String pageName) {
        ModelAndView modelAndView = new ModelAndView(pageName);
        return modelAndView;
    }
}
