package org.example.service.impl;

import com.github.pagehelper.PageHelper;
import org.example.domain.User;
import org.example.mapper.UserMapper;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public List<User> findALL(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return userMapper.findAll();
	}

}
