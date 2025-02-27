package com.example.booking.service;


import com.example.booking.repository.BookingRepo;
import com.example.booking.entity.BookingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    BookingRepo bookingRepo;

    public BookingEntity create(BookingEntity booking){
        return bookingRepo.save(booking);
    }

    public List<BookingEntity> getAll(){
        return bookingRepo.findAll();
    }

    public BookingEntity getOne(Long id){
        return bookingRepo.findById(id).orElseThrow();
    }


}
