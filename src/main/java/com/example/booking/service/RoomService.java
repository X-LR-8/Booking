package com.example.booking.service;

import com.example.booking.model.Hotel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RoomService {
    private static final List<Hotel> hotel=new ArrayList<>();
    public void Reserveroom(String hotelname, Integer roomnum){
        for(int i=0; i<hotel.size(); i++){
            if(hotel.get(i)==HotelService.gethotel(hotelname)){
                hotel.get(i).getRooms().put(roomnum,true);
            }
        }
    }
}
