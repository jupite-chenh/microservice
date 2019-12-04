package com.jupite.appcustomerlogin.entity;

import lombok.Data;

@Data
public class UserLoginDTO {
    private JWT jwt;
    private User user;
}
