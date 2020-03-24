package com.nero.mybatis.config.mapper;

import com.nero.mybatis.config.domain.User;

import java.util.List;

public interface UserMapper {

    User getUserById(Long id);

    List<User> getAllUser();

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(Long id);
}
