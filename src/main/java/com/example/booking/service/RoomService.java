package com.example.booking.service;

import com.example.booking.model.Hotel;
import com.example.booking.model.HotelList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RoomService {
    private final HotelList hotelList;

    @Autowired
    public RoomService(HotelList hotelList) {
        this.hotelList = hotelList;
    }
    public Hotel gethotel(String name){
        Hotel hotel1 = null;
        for(int i=0; i<hotelList.getHotels().size(); i++){
            if(hotelList.getHotels().get(i).getName().equals(name)){
                hotel1=hotelList.getHotels().get(i);
//                hotel1=Hotel.builder().name(hotel.get(i).getName()).maxrooms(hotel.get(i).getMaxrooms()).rooms(hotel.get(i).getRooms()).build();
            }
        }
        return hotel1;
    }
    public void Reserveroom(String hotelname, Integer roomnum){
        for(int i=0; i<hotelList.getHotels().size(); i++){
            if(hotelList.getHotels().get(i)==gethotel(hotelname)){
                hotelList.getHotels().get(i).getRooms().put(roomnum,true);
            }
        }
    }
}
