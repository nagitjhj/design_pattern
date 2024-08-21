package com.hi.design_pattern._01_creational_patterns._05_prototype.modelmapper;

public class Service {
    private void modelMapper() {
        UserCreateReq req = new UserCreateReq();
        req.setUserId("aaa");
        req.setPw("1234");
        req.setEmail("aaa@aaa.com");
        req.setAddress("address");

        //ModelMapper 라이브러리라 추가 필요함....
    }
}
