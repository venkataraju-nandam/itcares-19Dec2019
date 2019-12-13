package com.org.app.poc.itcares.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.app.poc.itcares.bean.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
