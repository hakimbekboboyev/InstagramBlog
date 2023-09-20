package com.example.instagramblog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String picture;
    private Integer age;
    private String birthday;
    private String phone;


}
