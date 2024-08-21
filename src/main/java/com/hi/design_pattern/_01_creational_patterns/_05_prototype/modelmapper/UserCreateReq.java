package com.hi.design_pattern._01_creational_patterns._05_prototype.modelmapper;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateReq {
    private String userId;
    private String pw;
    private String phone;
    private String address;
    private String email;
}
