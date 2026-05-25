package com.taskManager.controllers;

import com.taskManager.dto.UserDto.UserRequest;
import com.taskManager.dto.UserDto.UserResponse;
import com.taskManager.mapper.UserMapper;
import com.taskManager.model.User;
import com.taskManager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @PostMapping
    public UserResponse createUser(@RequestBody UserRequest request){
        return userService.response(request);
    }



}
