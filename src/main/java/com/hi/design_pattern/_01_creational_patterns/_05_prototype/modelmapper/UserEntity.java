package com.hi.design_pattern._01_creational_patterns._05_prototype.modelmapper;

import lombok.Getter;

public class UserEntity {
    private String id;
    private String userType;
    private String userId;
    private String pw;
    private String phone;
    private String address;
    private String email;

    public UserEntity(String userId, String pw, String phone, String address, String email) {
        this.userId = userId;
        this.pw = pw;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }
}
