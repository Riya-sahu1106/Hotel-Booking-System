package com.hotel.Hotel_Booking_System.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.Hotel_Booking_System.model.Hotel;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public Hotel getHotelById(Long id) {
        return hotelRepository.findById(id).orElse(null);
    }
}