package com.example.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.FriendEntity;
import com.example.pojo.Friend;

@Repository
public interface FriendDAORepository extends JpaRepository<FriendEntity, String>{

	
	
}
