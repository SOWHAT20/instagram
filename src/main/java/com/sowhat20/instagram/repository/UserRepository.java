package com.sowhat20.instagram.repository;

import com.sowhat20.instagram.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
