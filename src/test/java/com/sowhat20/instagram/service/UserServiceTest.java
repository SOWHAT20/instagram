package com.sowhat20.instagram.service;

import com.sowhat20.instagram.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void createUserTest() {
        User user = userService.createUser("test@naver.com", "1111111");
        assertEquals("test@naver.com", user.getEmail());
    }

}