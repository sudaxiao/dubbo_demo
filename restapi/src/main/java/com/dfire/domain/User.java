package com.dfire.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @desc  用户表
 * @author xiaosuda
 * @date 2017/12/26
 */
@Data
public class User implements Serializable{
    /**
     * 用户ID
     */
    private Integer id;
    /**
     * 用户名
     */
    private String  username;
    /**
     * 密码
     */
    private String  password;
}
