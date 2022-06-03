package com.it.dao;


import lombok.*;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2022-06-01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 状态 0启用，1禁用
     */
    private Integer state;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话号码
     */
    private String phone;


}
