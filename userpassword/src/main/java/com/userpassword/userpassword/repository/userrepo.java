package com.userpassword.userpassword.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userpassword.userpassword.model.user;

public interface userrepo  extends JpaRepository<user,Integer>{
    
}
