package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendDAO extends JpaRepository<FriendEntity, Long>{

	//All CRUD methods are automated!!!
	
}
