package com.example.booking.controllers;

import com.example.booking.model.Hotel;
import com.example.booking.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hotels")
public class Hotelcontroller {
    private final HotelService hotelService=new HotelService();
    @GetMapping
    public List<Hotel> getallhotel(){
        return hotelService.gethotellist();
    }
    @GetMapping("/{hotelname}")
    public Hotel gethotel(@PathVariable("hotelname") String hotelname){
        return hotelService.gethotel(hotelname);
    }
}
