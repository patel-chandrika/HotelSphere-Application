package com.chandrika.user.service.Service.service;

import java.util.List;

import com.chandrika.user.service.Service.entities.User;

public interface UserService {

    public User saveUser(User user);

    public List<User> getAllUsers();

    public User getUserById(String userId);

    public void deleteUserById(String userId);

    public User getUserByEmail(String email);
}
