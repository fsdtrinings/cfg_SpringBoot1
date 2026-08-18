package com.abc.test.service;

import org.springframework.stereotype.Service;

import com.abc.test.entity.UserEntity;

@Service
public interface UserService {

    UserEntity addUser(UserEntity user);

    UserEntity getUserByPhoneAndPassword(long phone,String password);
    
    UserEntity getUserById(long phone);
}