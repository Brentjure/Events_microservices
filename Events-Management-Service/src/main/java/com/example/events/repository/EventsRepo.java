package com.example.events.repository;

import com.example.events.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsRepo extends JpaRepository<EventEntity, Integer> {
}
