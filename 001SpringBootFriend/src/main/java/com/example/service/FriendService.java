package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.FriendDAO;
import com.example.pojo.Friend;

@Component
public class FriendService {
	
	@Autowired
	FriendDAO friendDao;

	public String welcome() {
		return "hello from Spring Boot";
	}
	
	public List getAll() {
		return friendDao.getAll();
	}

	public Friend getFriend(String id) {
		// TODO Auto-generated method stub
		return friendDao.getFriend(id);
	}
	
	public List addFriend(Friend f) {
		return friendDao.addFriend(f);
	}
	
	public List deleteFriend(String id) {
		return friendDao.deleteFriend(id);
	}
	
	public List updateFriend(Friend f) {
		return friendDao.updateFriend(f);
	}
	
	public List insertFriend() {
		return friendDao.insertFriend();
	}
}
