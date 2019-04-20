package com.trlogic.dao.mem;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.trlogic.dao.UserRepository;
import com.trlogic.model.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

	public List<User> users = new ArrayList<User>();
	
	public UserRepositoryImpl() {
		
	}
	
	@PostConstruct
	public void init() {
		User user1 = new User(1, "iersinyavas", "12345");
		User user2 = new User(2, "dalgakiran", "abc");
		User user3 = new User(3, "celcius", "asd");
		User user4 = new User(4, "bugatti", "veyron");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
	}

}
