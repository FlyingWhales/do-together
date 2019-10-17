package com.doto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doto.entity.User;
import com.doto.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public boolean emailExists(String email) {
		return userRepository.countByEmail(email) > 0;
	}
	
	public Long saveUser(User input) {
		 User user = userRepository.save(input);
		 return user.getUserId();
	}

}
