package org.example.mapper;

import org.example.domain.User;

import java.util.List;

public interface UserMapper {

    List<User> findAll();

    User findById(int id);

    User updateById(User user);

}
