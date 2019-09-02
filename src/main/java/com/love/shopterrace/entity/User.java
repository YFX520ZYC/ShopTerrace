package com.love.shopterrace.entity;


import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ZYC
 * @since 2019-05-20
 */
@Data
public class User {

    private static final long serialVersionUID = 1L;

	/**
	 * uId: id
	 * phone : 用户手机号，注册之后，默认账号为phone
	 * password ： 用户的密码，使用加密算法
	 */
	private Integer uId;
	private String phone;
	private String password;


}
