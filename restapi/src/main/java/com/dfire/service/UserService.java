package com.dfire.service;

import com.dfire.domain.User;
import com.dfire.vo.JsonResponse;

/**
 *
 * @author xiaosuda
 * @date 2017/12/26
 */
public interface UserService {

    JsonResponse<String> login(User user);

    JsonResponse<String> register(User user);
}
