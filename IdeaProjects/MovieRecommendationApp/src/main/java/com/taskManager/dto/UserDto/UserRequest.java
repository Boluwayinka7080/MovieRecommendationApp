package com.taskManager.dto.UserDto;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserRequest {
    private String username;
    private String phoneNumber;
    private String email;

    }

