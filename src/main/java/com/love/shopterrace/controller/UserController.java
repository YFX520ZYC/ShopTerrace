package com.love.shopterrace.controller;

import com.love.shopterrace.entity.User;
import com.love.shopterrace.service.UserService;
import com.love.shopterrace.util.ResultUtil;
import com.love.shopterrace.vo.ResultVO;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *   控制层最好不要写逻辑代码。
 * @author ZYC
 * @since 2019-05-20
 */
@RestController
@Api(value = "用户模块",tags = "用户各种操作模块")
public class UserController {
	@Autowired
    private UserService userService;

	 @GetMapping(value = "user/login.do")
     @ApiOperation(value = "登录操作",httpMethod = "GET",notes = "根据用户的phone号码，进行登录")
     @ApiImplicitParams({
             @ApiImplicitParam(name = "phone", value = "用户的手机号", paramType = "string", required = true),
             @ApiImplicitParam(name = "password", value = "用户的密码", paramType = "string", required = true),
     })
	public ResultVO loginUser(String phone,String password){
	    return userService.selectByPhone(phone,password);
    }


    @GetMapping(value = "user/add.do")
    @ApiOperation(value = "添加操作",httpMethod = "GET",notes = "普通注册，进行注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "用户的手机号", paramType = "string", required = true),
            @ApiImplicitParam(name = "password", value = "用户的密码", paramType = "string", required = true),
    })
    public ResultVO addUser(String phone,String password){
        return   userService.insertByUser(phone,password);
    }


    @PostMapping(value = "user/update.do")
    @ApiOperation(value = "添加操作",httpMethod = "GET",notes = "普通注册，进行注册")
    public ResultVO updateUser(@RequestBody @ApiParam(value = "修改") User user){
        return  userService.updateByUser(user);
    }


    @GetMapping(value = "user/selectId.do")
    @ApiOperation(value = "查询操作",httpMethod = "GET",notes = "根据用户id进行的查询操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "u_id", value = "用户的id", paramType = "int", required = true),
    })
    public ResultVO selectIdUser(Integer u_id){
        return userService.selectByIdUser(u_id);
    }
}
