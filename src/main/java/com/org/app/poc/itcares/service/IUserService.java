package com.org.app.poc.itcares.service;

import java.util.List;

import com.org.app.poc.itcares.UserDefinedException;
import com.org.app.poc.itcares.bean.UserEntity;

public interface IUserService {
	
	List<UserEntity> getAllUsers();
	UserEntity getUserById(Long id) throws UserDefinedException;
	UserEntity createOrUpdateUser(UserEntity entity) throws UserDefinedException;
	void deleteUserById(Long id) throws UserDefinedException;

}
