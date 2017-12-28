package com.dfire.mapper;

import com.dfire.domain.User;

/**
 *
 * @author xiaosuda
 * @date 2017/12/27
 */
public interface UserMapper {

    Integer selectByUser(User user);

    Integer insert(User user);
}
