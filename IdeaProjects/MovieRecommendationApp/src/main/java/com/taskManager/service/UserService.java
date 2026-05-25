package com.taskManager.service;

import com.taskManager.dto.UserDto.UserRequest;
import com.taskManager.dto.UserDto.UserResponse;
import com.taskManager.mapper.UserMapper;
import com.taskManager.model.User;
import com.taskManager.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;
    private final UserMapper userMapper;


    public UserResponse response(UserRequest request){
        User user = userMapper.toEntity(request);
        User savedUser = userRepo.save(user);

        return userMapper.toResponse(savedUser);
    }
}