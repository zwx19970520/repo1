package com.panda.dao;

import com.panda.domain.User;

import java.util.List;

public interface IUserDao {

    List<User>findAll();

    void insertUser(User user);

    void updateUser(User user);
}
