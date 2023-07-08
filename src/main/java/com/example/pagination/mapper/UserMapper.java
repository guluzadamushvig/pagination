package com.example.pagination.mapper;

import com.example.pagination.entity.UserEntity;
import com.example.pagination.model.request.UserRequest;
import com.example.pagination.model.response.UserResponse;
import java.time.LocalDateTime;

public class UserMapper {
    public static UserResponse mapEntityToResponse(UserEntity userEntity) {
        UserResponse userResponse = new UserResponse();
        userResponse.setId(userEntity.getId());
        userResponse.setName(userEntity.getName());
        userResponse.setEmail(userEntity.getEmail());
        userResponse.setAge(userEntity.getAge());
        userResponse.setCreatedAt(userEntity.getCreatedAt());
        return userResponse;
    }

    public static UserEntity mapEntityToEntity(UserRequest userRequest) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userRequest.getName());
        userEntity.setEmail(userRequest.getEmail());
        userEntity.setAge(userRequest.getAge());
        userEntity.setCreatedAt(LocalDateTime.now());
        return userEntity;
    }
}
