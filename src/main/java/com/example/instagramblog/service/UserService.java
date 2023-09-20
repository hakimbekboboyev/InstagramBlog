package com.example.instagramblog.service;

import com.example.instagramblog.dto.UserDto;
import com.example.instagramblog.model.User;
import com.example.instagramblog.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public User create(UserDto userDto){
        Date date = new Date();
        User user = new User();
        user.setAge(userDto.getAge());
        user.setBirthday(userDto.getBirthday());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setPicture(user.getPicture());
        user.setIsAdmin(false);
        user.setPhone(userDto.getPhone());
        user.setRegisterDate(String.format("%d.%m.%y",date.getDay(),date.getMonth(),date.getYear()));

        return userRepository.save(user);
    }


}
