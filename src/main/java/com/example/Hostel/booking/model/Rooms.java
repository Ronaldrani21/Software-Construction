package com.example.Hostel.booking.model;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Rooms  
{  
//Defining room id as primary key  
@Id  
@Column  
private int roomid;  
@Column  
private String roomType;   
@Column  
private int price;  
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