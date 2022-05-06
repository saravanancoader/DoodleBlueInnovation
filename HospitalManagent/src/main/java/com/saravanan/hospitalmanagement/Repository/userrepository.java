package com.saravanan.hospitalmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saravanan.hospitalmanagement.Entity.User;

@Repository
public interface userrepository extends JpaRepository<User, String> {
	
	

}
