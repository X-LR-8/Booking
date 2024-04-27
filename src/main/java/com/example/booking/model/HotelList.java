package com.example.booking.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class HotelList {
    private final List<Hotel> hotels = new ArrayList<>();

    public HotelList() {
        hotels.add(Hotel.builder().name("room1").maxrooms(10).rooms(createRoomMap(10)).build());
        hotels.add(Hotel.builder().name("room2").maxrooms(40).rooms(createRoomMap(40)).build());
        hotels.add(Hotel.builder().name("room3").maxrooms(20).rooms(createRoomMap(20)).build());
        hotels.add(Hotel.builder().name("room4").maxrooms(30).rooms(createRoomMap(30)).build());
    }

    private Map<Integer, Boolean> createRoomMap(int maxRooms) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 1; i <= maxRooms; i++) {
            map.put(i, false);
        }
        return map;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }
}
