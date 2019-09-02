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
public class Userdetails{

    private static final long serialVersionUID = 1L;

	private Integer id;
	private String userhead;
	private String username;
	private String usersignature;
	private Integer age;
	private String sex;
	private String hometown;
	private String email;
	private String qq;
	private Integer uId;



}
