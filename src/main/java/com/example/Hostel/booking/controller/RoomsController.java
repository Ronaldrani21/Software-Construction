package com.example.Hostel.booking.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.example.Hostel.booking.model.Rooms;  
import com.example.Hostel.booking.service.RoomsService;  
//mark class as Controller  
@RestController  
public class RoomsController   
{  
//autowire the RoomsService class  
@Autowired  
RoomsService roomsService;  
//creating a get mapping that retrieves all the room details from the database   
@GetMapping("/room")  
private List<Rooms> getAllRooms()   
{  
return roomsService.getAllRooms();  
}  
//creating a get mapping that retrieves the detail of a specific room  
@GetMapping("/room/{roomid}")  
private Rooms getRooms(@PathVariable("roomid") int roomid)   
{  
return roomsService.getRoomsById(roomid);  
}  
//creating a delete mapping that deletes a specified room  
@DeleteMapping("/room/{roomid}")  
private void deleteRoom(@PathVariable("roomid") int roomid)   
{  
roomsService.delete(roomid);  
}  
//creating post mapping that post the room details in the database  
@PostMapping("/room")  
private int saveRoom(@RequestBody Rooms rooms)   
{  
roomsService.saveOrUpdate(rooms);  
return rooms.getRoomid();  
}  
//creating put mapping that updates the room details
@PutMapping("/rooms")  
private Rooms update(@RequestBody Rooms rooms)   
{  
roomsService.saveOrUpdate(rooms);  
return rooms;  
}  
}  