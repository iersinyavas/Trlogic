package com.trlogic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.trlogic.dao.UserRepository;
import com.trlogic.model.entity.User;
import com.trlogic.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean getUser(String username, String password) {
		if(userRepository.getUser(username, password))
			return true;
		else
			return false;
	}

	@Override
	public void userSave(User user) {
		userRepository.userSave(user);
	}

}
