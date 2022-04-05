package com.example.Hostel.booking.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.example.Hostel.booking.model.Rooms;  
import com.example.Hostel.booking.Repository.RoomsRepository;  
//defining the business logic  
@Service  
public class RoomsService   
{  
@Autowired  
RoomsRepository roomsRepository;  
//getting all room records by using the method findaAll() 
public List<Rooms> getAllRooms()   
{  
List<Rooms> rooms = new ArrayList<Rooms>();  
roomsRepository.findAll().forEach(Room1 -> rooms.add(Room1));  
return rooms;  
}  
//getting a specific record by using the method findById() 
public Rooms getRoomsById(int id)   
{  
return roomsRepository.findById(id).get();  
}  
//saving a specific record by using the method save()  
public void saveOrUpdate(Rooms rooms)   
{  
roomsRepository.save(rooms);  
}  
//deleting a specific record by using the method deleteById() 
public void delete(int id)   
{  
roomsRepository.deleteById(id);  
}  
//updating a record  
public void update(Rooms rooms, int roomid)   
{  
roomsRepository.save(rooms);  
}  
} 