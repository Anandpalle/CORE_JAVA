package com.mechanicbuddy.dao;

import java.util.List;
import com.mechanicbuddy.model.User;

public interface UserDAO {

    boolean registerUser(User user);

    User loginUser(String email, String password);

    List<User> getAllUsers();
    boolean updateUser(User user);
}