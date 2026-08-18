package com.abc.test.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.test.entity.UserEntity;



@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

	
	public UserEntity findByPhoneAndPassword(long phone,String password);
	
}