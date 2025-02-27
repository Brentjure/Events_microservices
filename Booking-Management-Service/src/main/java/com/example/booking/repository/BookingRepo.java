package com.example.booking.repository;

import com.example.booking.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<BookingEntity, Long> {
}
