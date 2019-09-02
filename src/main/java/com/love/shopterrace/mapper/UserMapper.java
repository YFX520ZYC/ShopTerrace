package com.love.shopterrace.mapper;

import com.love.shopterrace.entity.User;
import org.springframework.stereotype.Repository;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author ZYC
 * @since 2019-05-20
 */

@Repository
public interface UserMapper {

    public User seleteUser(String phone);

    public void insertUser(User user);

    public User selectIdUser(Integer id);
    public void updateUser(User user);

 /*
    public void deleteUser(int id);*/

}