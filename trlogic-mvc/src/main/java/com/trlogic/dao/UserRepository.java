package com.trlogic.dao;

import java.util.List;

import com.trlogic.model.entity.User;

public interface UserRepository {
	
	boolean getUser(String username, String password);

	void userSave(User user);
}
