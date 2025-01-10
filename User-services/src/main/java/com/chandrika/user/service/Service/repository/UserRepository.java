package com.chandrika.user.service.Service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chandrika.user.service.Service.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    public User findByEmail(String email);
}
