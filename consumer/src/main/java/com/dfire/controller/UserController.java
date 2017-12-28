package com.dfire.controller;

import com.dfire.domain.User;
import com.dfire.service.UserService;
import com.dfire.vo.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author xiaosuda
 * @date 2017/12/15
 */
@Controller
@RequestMapping("user/")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse<String> login(User user) {
        return userService.login(user);
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse<String> register(User user) {
        return userService.register(user);
    }
}
