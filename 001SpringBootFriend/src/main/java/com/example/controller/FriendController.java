package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Friend;
import com.example.service.FriendService;

@RestController
public class FriendController {
	
	@Autowired
	private FriendService friendService;

	@RequestMapping("/welcome")
	public String welcome() {
		return friendService.welcome();
	}
	
	
	@RequestMapping(value ="/all",method=RequestMethod.GET )
	public List getAll() {
		return friendService.getAll();
	}
	
	@RequestMapping(value= "/get/{id}", method= RequestMethod.GET)
	public Friend getFriend(@PathVariable(value="id") String id) {
		return friendService.getFriend(id);
	}
	
	@RequestMapping(value="/add", method=RequestMethod.PUT)
	public List addFriend(@RequestBody Friend f) {
		return friendService.addFriend(f);
		
	}
	
	
	@RequestMapping(value = "/delete/{id}", method=RequestMethod.DELETE)
	public List deleteFriend(@PathVariable(value= "id") String id) {
		return friendService.deleteFriend(id);
	}
	
	
	@RequestMapping(value = "/update", method  = RequestMethod.POST)
	public List updateFriend(@RequestBody Friend f) {
		return friendService.updateFriend(f);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public List insertFriend() {
		return friendService.insertFriend();
	}
	
	
}
