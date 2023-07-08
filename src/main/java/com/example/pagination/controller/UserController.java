package com.example.pagination.controller;

import com.example.pagination.model.criteria.PageCriteria;
import com.example.pagination.model.criteria.UserCriteria;
import com.example.pagination.model.request.UserRequest;
import com.example.pagination.model.response.PageableUserResponse;
import com.example.pagination.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/users")
public class UserController {

    private final UserService userService;


    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void saveUser(@RequestBody UserRequest userRequest){
        userService.saveUser(userRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public PageableUserResponse getUsers(PageCriteria pageCriteria, UserCriteria userCriteria,
                                         @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")LocalDateTime createdDate) {

        return userService.getUsers(pageCriteria, userCriteria);
    }
}
