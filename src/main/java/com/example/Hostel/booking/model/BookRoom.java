package com.example.Hostel.booking.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class BookRoom {
	//Defining room id as primary key  
	@Id  
	@Column
	private String name;
	@Column
	private int contact;
	@Column  
	private int roomid;  
	@Column  
	private String roomType;   
	@Column  
	private int price; 
	@Column
	private int Amountpaid;
	@Column
	private String Roomstatus;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getAmountpaid() {
		return Amountpaid;
	}
	public void setAmountpaid(int amountpaid) {
		Amountpaid = amountpaid;
	}
	public String getRoomstatus() {
		return Roomstatus;
	}
	public void setRoomstatus(String roomstatus) {
		Roomstatus = roomstatus;
	}
	public int getRoomid()   
	{  
	return roomid;  
	}  
	public void setBookid(int roomid)   
	{  
	this.roomid = roomid;  
	}  
	public String getroomType()  
	{  
	return roomType;  
	}  
	public void setroomType(String roomType)   
	{  
	this.roomType = roomType;  
	}  
	public int getPrice()   
	{  
	return price;  
	}  
	public void setPrice(int price)   
	{  
	this.price = price;  
	}  
	}  
