package com.example.events.controller;

import com.example.events.dto.ApiResponse;
import com.example.events.entity.EventEntity;
import com.example.events.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/events")
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping("")
    public ApiResponse<EventEntity> createEvent(@RequestBody EventEntity newEvent){
        EventEntity event = eventService.create(newEvent);
        return new ApiResponse<>("success", event, "Event Created!");
    }

    @GetMapping("")
    public ApiResponse<List<EventEntity>> getAllEvents(){
        List<EventEntity> events = eventService.getAll();

        return new ApiResponse<>("success", events, "Events retrived successfully!");
    }

}
