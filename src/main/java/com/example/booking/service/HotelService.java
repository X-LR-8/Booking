package com.example.booking.service;

import com.example.booking.model.Hotel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class HotelService {
    private static final List<Hotel> hotel=new ArrayList<>();

    public List<Hotel> gethotellist(){
        return hotel;
    }
    public void hotelbuild(String name, Integer maxmemb){
        Map<Integer, Boolean> map=new HashMap<>();
        for(int i=1; i<=maxmemb; i++){
            map.put(i,false);
        }
        Hotel hotel1=Hotel.builder().name(name).maxrooms(maxmemb).rooms(map).build();
        hotel.add(hotel1);
    }
    public HotelService(){
        hotelbuild("room1",10);
        hotelbuild("room2",40);
        hotelbuild("room3",20);
        hotelbuild("room4",30);
    }
    public static Hotel gethotel(String name){
        Hotel hotel1 = null;
        for(int i=0; i<hotel.size(); i++){
            if(hotel.get(i).getName().equals(name)){
                hotel1=hotel.get(i);
//                hotel1=Hotel.builder().name(hotel.get(i).getName()).maxrooms(hotel.get(i).getMaxrooms()).rooms(hotel.get(i).getRooms()).build();
            }
        }
        return hotel1;
    }
}
