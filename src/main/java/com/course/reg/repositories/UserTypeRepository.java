package com.course.reg.repositories;
import com.course.reg.models.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

//import com.example.demo.models.User;


public interface UserTypeRepository extends JpaRepository <UserType, Integer>{
	
//	UserType findUserByEmail(String typeName);
	UserType findUserTypeById(int id);
} 

	