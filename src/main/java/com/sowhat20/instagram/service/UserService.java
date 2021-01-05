package com.sowhat20.instagram.service;

import com.sowhat20.instagram.entity.User;
import com.sowhat20.instagram.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User createUser(String email , String password) {
        return userRepository.save(new User(email, password));
    }

}
