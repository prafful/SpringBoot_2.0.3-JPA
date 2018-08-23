package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendController {
	
	@Autowired
	private FriendDAO friendDao;
	
	@RequestMapping("/add")
	public void addFriend() {
		
		FriendEntity f1 = new FriendEntity(1L, "PD", "Bharat");
		FriendEntity f2 = new FriendEntity(2L, "AD", "AHM");
		FriendEntity f3 = new FriendEntity(3L, "BD", "MUM");
		FriendEntity f4 = new FriendEntity(4L, "VD", "KRL");
		
		
		friendDao.save(f1);
		friendDao.save(f2);
		friendDao.save(f3);
		friendDao.save(f4);
	}
	
	@RequestMapping("/get")
	public List<FriendEntity> getFriend() {
		return friendDao.findAll();
	}

}
