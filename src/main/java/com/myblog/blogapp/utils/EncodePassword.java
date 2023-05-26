package com.myblog.blogapp.utils;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class EncodePassword {

    public static void main(String[] args) {

        PasswordEncoder encodePassword = new BCryptPasswordEncoder();
        System.out.println(encodePassword.encode("Akshay@123"));
    }

}
