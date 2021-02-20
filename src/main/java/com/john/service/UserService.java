package com.john.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.john.dao.UserDao;
import com.john.entity.UserEntity;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	
	
	public List<UserEntity> getAll(){
		return dao.findAll();
	}
	
	public UserEntity save(UserEntity entity){
		return dao.save(entity);
	}

}
