package com.example.events_users_microservices.repository;

import com.example.events_users_microservices.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {
}
