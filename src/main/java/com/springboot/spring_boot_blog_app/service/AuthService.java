package com.springboot.spring_boot_blog_app.service;

import com.springboot.spring_boot_blog_app.payload.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
