package com.jingdianjichi.user.controller;

import com.jingdianjichi.user.entity.dto.UserDto;
import com.jingdianjichi.user.entity.req.UserReq;
import com.jingdianjichi.user.mapper.service.UserService;
import com.jingdianjichi.user.mapper.service.impl.UserServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    //新增就用post 用的时候要打上RequestBody才能有效
    //查询就用get
    @Autowired
    private UserService userService;
    @PostMapping
    public Integer addUser(@RequestBody UserReq userReq) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userReq, userDto);
        int i = userService.addUser(userDto);
        return i;
    }
}
