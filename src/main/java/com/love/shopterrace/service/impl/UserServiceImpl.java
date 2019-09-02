package com.love.shopterrace.service.impl;


import com.love.shopterrace.entity.User;
import com.love.shopterrace.mapper.UserMapper;
import com.love.shopterrace.service.UserService;
import com.love.shopterrace.util.ResultUtil;
import com.love.shopterrace.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ZYC
 * @since 2019-05-20
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultVO selectByPhone(String phone, String password) {
        User user = userMapper.seleteUser(phone);
        if (user != null){
            if (user.getPassword().equals(password)){
                return ResultUtil.exec(user != null,"登录成功",null);
            }
        }
        return ResultUtil.setError();
    }

    @Override
    public ResultVO insertByUser(String phone, String password) {

        User user = userMapper.seleteUser(phone);
        if (user == null){
            User user1 = new User();
            user1.setPhone(phone);
            user1.setPassword(password);
            userMapper.insertUser(user1);
            return ResultUtil.setOK("注册成功");
        }
        return ResultUtil.setError();
    }

    @Override
    public ResultVO selectByIdUser(Integer id) {
        User user = userMapper.selectIdUser(id);
        System.out.println(user);
        return ResultUtil.exec(user != null,"查找用户信息成功",user);
    }

    @Override
    public ResultVO updateByUser(User user) {
        userMapper.updateUser(user);
        return ResultUtil.setOK("修改成功");
    }


}
