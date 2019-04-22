package com.trlogic.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.trlogic.dao.UserRepository;
import com.trlogic.model.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	public List<User> users = new ArrayList<User>();
	
	public UserRepositoryImpl() {
		User user1 = new User(1, "ozgur", "123");
		User user2 = new User(2, "admin", "admin");
		User user3 = new User(3, "ersin", "ersin");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
	}

	@Override
	public boolean getUser(String username, String password){
		int boyut = this.users.size();
		for(int i=0; i<boyut; i++) {
			if(username.equals(this.users.get(i).getUsername()) && password.equals(this.users.get(i).getPassword())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void userSave(User user) {
		users.add(user);
	}

}
