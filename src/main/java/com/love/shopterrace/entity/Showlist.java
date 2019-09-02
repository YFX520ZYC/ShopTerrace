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
public class Showlist {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private String namelist;
	private String photo;
	private Integer size;
	private String url;



}
