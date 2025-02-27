package com.example.events.service;

import com.example.events.entity.EventEntity;
import com.example.events.repository.EventsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EventService {

    @Autowired
    EventsRepo eventsRepo;

    public EventEntity create(EventEntity newEvent){
        return eventsRepo.save(newEvent);
    }

    public List<EventEntity> getAll(){
        return eventsRepo.findAll();
    }

    public EventEntity getOne(int id){
        return eventsRepo.findById(id).orElseThrow(()->
                new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public  EventEntity updateOne(int id, EventEntity updatedEvent){
        EventEntity currentEvent = eventsRepo.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));

        currentEvent.setTitle(updatedEvent.getTitle());
        currentEvent.setDetails(updatedEvent.getDetails());
        currentEvent.setEventDate(updatedEvent.getEventDate());
        currentEvent.setLocation(updatedEvent.getLocation());
        currentEvent.setPrice(updatedEvent.getPrice());
        currentEvent.setAvailability(updatedEvent.isAvailability());
        currentEvent.setMaxNumber(updatedEvent.getMaxNumber());
        currentEvent.setEventOrganiser(updatedEvent.getEventOrganiser());

        eventsRepo.save(currentEvent);
        return currentEvent;

    }

    public void delete(int id){
        eventsRepo.deleteById(id);

    }
}
