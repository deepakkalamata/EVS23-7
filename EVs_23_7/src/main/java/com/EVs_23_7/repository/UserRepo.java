package com.EVs_23_7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EVs_23_7.entity.UserData;

public interface UserRepo extends JpaRepository<UserData,String>{

}
