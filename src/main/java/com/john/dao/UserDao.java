package com.john.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.john.entity.UserEntity;





@Repository
public interface UserDao extends JpaRepository<UserEntity, Integer> {

}
