package com.example.instagramblog.dto;

import com.example.instagramblog.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseUser {
    private Integer user_id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String picture;
    private Integer age;
    private String birthday;
    private String phone;
    private String token;
    private Role role;
    private String email;
    private String registerDate;
}
