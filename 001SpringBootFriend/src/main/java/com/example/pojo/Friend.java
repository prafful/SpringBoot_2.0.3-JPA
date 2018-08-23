package com.example.pojo;

public class Friend {
	
	private String Id;
	private String name;
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
	public Friend(String id, String name, String location) {
		super();
		Id = id;
		this.name = name;
		this.location = location;
	}
	
	
	public Friend() {
		super();
		
	}
	
	

}
