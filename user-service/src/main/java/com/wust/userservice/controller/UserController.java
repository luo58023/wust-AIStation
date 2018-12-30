package com.wust.userservice.controller;

import com.wust.userservice.pojo.response.ResponseBuilder;
import com.wust.userservice.pojo.User;
import com.wust.userservice.service.RedisService;
import com.wust.userservice.service.TokenService;
import com.wust.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author ygtao
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    TokenService tokenService;

    @Autowired
    RedisService redisService;

    /**
     * 登录
     * @param userName
     * @param password
     * @return 登录成功，返回用户信息user和token
     */
    @PostMapping("/login")
    public ResponseEntity login(@RequestParam("userName") String userName,
                                @RequestParam("password") String password) {
        User user = userService.getUserByName(userName);
        if (user == null) {
            return ResponseBuilder.notFound();
        } else {
            if (password.equals(user.getPassword())) {
                HashMap<String, Object> map = new HashMap<>(2);
                //验证成功，生成token
                String token = tokenService.generateToken();
                map.put("user", user);
                map.put("token", token);
                //保存到缓存
                redisService.set(token, user, 5 * 60 * 1000);
                return ResponseBuilder.ok(map);
            } else {
                //密码错误
                return ResponseBuilder.conflict();
            }
        }
    }

    /**
     * 注册用户
     * @param user
     * @return
     */
    @PostMapping("/register")
    public ResponseEntity register(@RequestBody User user) {
        //获取用户名，判断用户是否已存在
        User tempUser = userService.getUserByName(user.getUserName());
        if (tempUser != null){
            return ResponseBuilder.conflict();
        } else {
            //注册新用户
            boolean status = userService.addUser(user);
            if (status) {
                return ResponseBuilder.ok("注册成功");
            } else {
                 return ResponseBuilder.DEFAULT_ERROR_RESPONSE;
            }
        }
    }
}
