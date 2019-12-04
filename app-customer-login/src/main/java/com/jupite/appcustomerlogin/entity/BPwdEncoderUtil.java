package com.jupite.appcustomerlogin.entity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 用于对密码进行编码
 * @author huizh
 */
public class BPwdEncoderUtil{
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static String BCryptPassword(String password){
        return encoder.encode(password);
    }

    public static boolean matches(CharSequence rawPassword, String encodedPassword){
        return encoder.matches(rawPassword,encodedPassword);
    }
}
