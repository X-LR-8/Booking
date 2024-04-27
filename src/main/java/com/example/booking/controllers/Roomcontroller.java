package com.example.booking.controllers;

import com.example.booking.service.HotelService;
import com.example.booking.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rooms")
public class Roomcontroller {
    private final RoomService roomService=new RoomService();
    @PostMapping("/{hotelname}")
    public void roomreserve(@PathVariable("hotelname") String hotelname, @RequestParam("roomnum") Integer roomnum){
        roomService.Reserveroom(hotelname,roomnum);
    }
}