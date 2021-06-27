package com.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class UserRepoImpl implements UserRepo {

	User user1 = new User(1l,"user1@mail.com","Password","user1");
	User user2 = new User(2l,"user2@mail.com","Password","user12");

	@Override
	public List<User> findAll() {
		return Arrays.asList(user1,user2);
	}

	@Override
	public User findOne(Long userId) {
		return user1;
	}
}
