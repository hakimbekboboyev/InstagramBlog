package com.example.instagramblog.service;

import com.example.instagramblog.dto.ResponseUser;
import com.example.instagramblog.dto.UserDto;
import com.example.instagramblog.model.Role;
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

    private final JwtService jwtService;
    public ResponseUser create(UserDto userDto){
        Date date = new Date();
        User user = new User();
        user.setAge(userDto.getAge());
        user.setBirthday(userDto.getBirthday());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setPicture(userDto.getPicture());
        user.setEmail(userDto.getEmail());

        user.setRole(Role.USER);
        user.setPhone(userDto.getPhone());
        user.setRegisterDate((date.getDay()+17)+"."+(date.getMonth()+1)+"."+(date.getYear()+1900));


        User save_user = userRepository.save(user);
        var jwtToken = jwtService.generateToken(save_user);

        ResponseUser responseUser = new ResponseUser();
        responseUser.setToken(jwtToken);
        responseUser.setPassword(save_user.getPassword());

        responseUser.setAge(save_user.getAge());
        responseUser.setBirthday(save_user.getBirthday());
        responseUser.setPhone(save_user.getPhone());
        responseUser.setUsername(save_user.getUsername());
        responseUser.setPicture(save_user.getPicture());
        responseUser.setFirstName(save_user.getFirstName());
        responseUser.setLastName(save_user.getLastName());

        responseUser.setEmail(save_user.getEmail());
        responseUser.setRegisterDate(save_user.getRegisterDate());
        return responseUser;
    }


}
