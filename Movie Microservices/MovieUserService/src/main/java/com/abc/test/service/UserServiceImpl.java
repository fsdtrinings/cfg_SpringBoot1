package com.abc.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.test.entity.UserEntity;
import com.abc.test.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserEntity addUser(UserEntity user) {
		return userRepository.save(user);
	}

	@Override
	public UserEntity getUserByPhoneAndPassword(long phone, String password) {
		 return userRepository.findByPhoneAndPassword(phone, password);
	}

	@Override
	public UserEntity getUserById(long phone) {
		return userRepository.findById(phone).get();
	}

	
	
}
