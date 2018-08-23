package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="FriendNewH2")
public class FriendEntity {
	@Column
	@Id
	private String Id;
	@Column
	private String name;
	@Column
	private String location;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public FriendEntity(String id, String name, String location) {
		super();
		Id = id;
		this.name = name;
		this.location = location;
	}
	public FriendEntity() {
		super();
		
	}

	
	
	
}
