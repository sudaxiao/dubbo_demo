package com.dfire.service.impl;

import com.dfire.domain.User;
import com.dfire.mapper.UserMapper;
import com.dfire.service.UserService;
import com.dfire.vo.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author xiaosuda
 * @date 2017/12/26
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public JsonResponse<String> login(User user) {
        Integer login = userMapper.selectByUser(user);
        if (login == 0) {
            return new JsonResponse<>(false, "帐号或密码错误,请检查后重试");
        }
        return new JsonResponse<>(true, "登录成功", user.getUsername());
    }

    @Override
    public JsonResponse<String> register(User user) {
        Integer register = userMapper.insert(user);
        if (register == 0) {
            return new JsonResponse<>(false, "注册失败");
        }

        return new JsonResponse<>(true, "注册成功", user.getUsername());
    }
}
