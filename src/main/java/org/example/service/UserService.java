package org.example.service;

import org.example.domain.User;

import java.util.List;

public interface UserService {

	List<User> findALL(int pageNum, int pageSize);

	User findById(int id);

	User updateById(User user);

}
