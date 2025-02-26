package com.example.events_users_microservices.services;

import com.example.events_users_microservices.entity.UserEntity;
import com.example.events_users_microservices.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserServices {
    @Autowired
    UserRepo userRepo;

    public UserEntity createUser(UserEntity newUser){
        return userRepo.save(newUser);

    }

    public List<UserEntity> getAll(){
        return userRepo.findAll();
    }

    public UserEntity getOne(int userId){
        return userRepo.findById(userId).orElseThrow(()->
                new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public UserEntity updateOne(int userId, UserEntity updatedUser){
        UserEntity currentUser =  userRepo.findById(userId)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
        currentUser.setUserName(updatedUser.getUserName());
        currentUser.setPassword(updatedUser.getPassword());
        currentUser.setEmail(updatedUser.getEmail());
        currentUser.setPhoneNumber(updatedUser.getPhoneNumber());
        currentUser.setRole(updatedUser.getRole());

        return userRepo.save(currentUser);

    }

    public void delete(int userId){
        userRepo.deleteById(userId);

    }


}
