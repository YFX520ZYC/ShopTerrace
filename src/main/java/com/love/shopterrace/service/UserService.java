package com.love.shopterrace.service;

import com.love.shopterrace.entity.User;
import com.love.shopterrace.vo.ResultVO;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ZYC
 * @since 2019-05-20
 */
public interface UserService {

    /**
     * 用户登录
     * @param phone
     * @param password  用户的密码
     * @return
     */
    public ResultVO selectByPhone(String phone,String password);

    /**
     *  用户注册
     * @param phone  用户的手机号
     * @param password 用户的密码
     * @return
     */
    public ResultVO insertByUser(String phone,String password);


    /**
     * 根据用户的id查询用户
     * @param id   用户的id
     * @return
     */
    public ResultVO selectByIdUser(Integer id);


    /**
     * 用户根据id进行修改时候
     * @param user  其中用户
     * @return
     */
	public ResultVO updateByUser(User user);



/*
	public ResultVO deleteByUser(int id);*/
}
