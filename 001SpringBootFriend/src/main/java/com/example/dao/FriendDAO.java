package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import org.mockito.exceptions.misusing.FriendlyReminderException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.entity.FriendEntity;
import com.example.pojo.Friend;
import com.example.repository.FriendDAORepository;

@Component
public class FriendDAO {

	ArrayList<Friend> friends;
	
	@Autowired
	private FriendDAORepository friendDaoRepository;
	
	public FriendDAO() {
		// TODO Auto-generated constructor stub
		friends = new ArrayList<Friend>();
		friends.add(new Friend("1", "Prafful Daga", "Chennai"));
		friends.add(new Friend("2", "Tamil O", "Chennai"));
		friends.add(new Friend("3", "Pradhi", "TN"));
		friends.add(new Friend("4", "Pradeep", "Mumbai"));
		friends.add(new Friend("5", "Adi", "Jodhpur"));
		friends.add(new Friend("6", "Pranam M", "India"));
		
		//friendDaoRepository.saveAll(friends);
	}
	
	
	public List getAll() {
		//return friends;
		//return from JpaRepository
		//converting entity arrylist to pojo arraylist
		ArrayList<FriendEntity> friendEntities = (ArrayList<FriendEntity>) friendDaoRepository.findAll();
		ArrayList<Friend> friends = new ArrayList<Friend>();
		for(FriendEntity fe: friendEntities) {
			friends.add(new Friend(fe.getId(), fe.getName(), fe.getLocation()));
		}
		return friends;
	}


	public Friend getFriend(String id) {
		// TODO Auto-generated method stub
		/*for(Friend f: friends) {
			if(f.getId().equals(id)) {
				return f;
			}
		}
		
		return null;*/
		
		FriendEntity fe = friendDaoRepository.findById(id).orElse(null);
		Friend f = new Friend(fe.getId(), fe.getName(), fe.getLocation());
		return f;
	}
	
	
	public List addFriend(Friend f) {
		//friends.add(f);
		//return friends;
		FriendEntity fe = new FriendEntity(f.getId(), f.getName(), f.getLocation());
		friendDaoRepository.save(fe);
		//converting entity arrylist to pojo arraylist
		ArrayList<FriendEntity> friendEntities = (ArrayList<FriendEntity>) friendDaoRepository.findAll();
		ArrayList<Friend> friends = new ArrayList<Friend>();
		for(FriendEntity fe1: friendEntities) {
			friends.add(new Friend(fe1.getId(), fe1.getName(), fe1.getLocation()));
		}
		return friends;
		
	}
	
	public List deleteFriend(String id) {
		
		/*Friend friend = new Friend();
		for(Friend f: friends) {
			if(f.getId().equals(id)) {
				friend = f;
			}
		}
		
		friends.remove(friend);
		
		return friends;*/
		friendDaoRepository.deleteById(id);
		//converting entity arrylist to pojo arraylist
		ArrayList<FriendEntity> friendEntities = (ArrayList<FriendEntity>) friendDaoRepository.findAll();
		ArrayList<Friend> friends = new ArrayList<Friend>();
		for(FriendEntity fe1: friendEntities) {
			friends.add(new Friend(fe1.getId(), fe1.getName(), fe1.getLocation()));
		}
		//return pojo array list
		return friends;
		
	}
	
	public List updateFriend(Friend f) {
		
		FriendEntity fe = new FriendEntity(f.getId(), f.getName(), f.getLocation());
		friendDaoRepository.save(fe);
		//converting entity arrylist to pojo arraylist
		ArrayList<FriendEntity> friendEntities = (ArrayList<FriendEntity>) friendDaoRepository.findAll();
		ArrayList<Friend> friends = new ArrayList<Friend>();
		for(FriendEntity fe1: friendEntities) {
			friends.add(new Friend(fe1.getId(), fe1.getName(), fe1.getLocation()));
		}
		return friends;
		
	}
	
	public List insertFriend() {
		ArrayList<FriendEntity> friendEntities;
		friendEntities = new ArrayList<FriendEntity>();
		for(Friend f: friends) {
			friendEntities.add(new FriendEntity(f.getId(),f.getName(), f.getLocation()));
		}
		
		return friendDaoRepository.saveAll(friendEntities);
		
		
	}
	
	
	
	
}
