package com.taskManager.controllers;

import com.taskManager.dto.UserDto.UserRequest;
import com.taskManager.dto.UserDto.UserResponse;
import com.taskManager.mapper.UserMapper;
import com.taskManager.model.User;
import com.taskManager.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @PostMapping
    public UserResponse createUser(@RequestBody UserRequest request){
        return userService.response(request);
    }


    @GetMapping("/{id}")
    public UserResponse getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

}
