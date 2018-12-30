package com.wust.userservice.service;

import com.wust.userservice.mapper.UserMapper;
import com.wust.userservice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ygtao
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    RedisService redisService;

    public User getUserByName(String userName) {
        return userMapper.getUserByName(userName);
    }

    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    public boolean deleteUserByName(String userName) {
        return userMapper.deleteUserByName(userName);
    }

    public boolean deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }

    public boolean updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public boolean addUser(User user) {
        return userMapper.addUser(user);
    }

    /**
     * 根据token获取用户名
     * @param token
     * @return
     */
    public String getUserNameFromToken(String token) {
        User user = (User)redisService.get(token);
        return user == null ? null : user.getUserName();
    }

    /**
     * 根据token获取用户id
     * @param token
     * @return
     */
    public Integer getUserIdFromToken(String token) {
        User user = (User)redisService.get(token);
        return user == null ? null : user.getId();
    }

}
