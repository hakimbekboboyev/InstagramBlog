package com.example.instagramblog.controller;

import com.example.instagramblog.dto.UserDto;
import com.example.instagramblog.model.User;
import com.example.instagramblog.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> create(@RequestBody UserDto userDto){
        User user = userService.create(userDto);
        return ResponseEntity.ok(user);
    }
}
