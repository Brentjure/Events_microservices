package com.example.booking.controller;

import com.example.booking.dto.ApiResponse;
import com.example.booking.dto.Events;
import com.example.booking.entity.BookingEntity;
import com.example.booking.service.BookingService;
import org.apache.tomcat.util.codec.binary.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/bookings")
public class BookingController {

    public final static String URL_BOOKING = "http://localhost:8081/api/v1/events";

    @Autowired
    BookingService bookingService;

    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/{id}")
    public ApiResponse<BookingEntity> bookEvent(@PathVariable("id") int id,
                                                @RequestBody BookingEntity booking){

        try{
            // send request to events services to check for availability
            Events event = restTemplate.getForObject(URL_BOOKING + id, Events.class);

            //






        }catch(Exception ex){

        }






        return new ApiResponse<>("success", null, "Event created");
    }


}
