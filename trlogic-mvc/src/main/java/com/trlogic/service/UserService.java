package com.trlogic.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.trlogic.dao.UserRepository;
import com.trlogic.model.entity.User;

public interface UserService {
	
	boolean getUser(String username, String password);

	void userSave(User user);
}
