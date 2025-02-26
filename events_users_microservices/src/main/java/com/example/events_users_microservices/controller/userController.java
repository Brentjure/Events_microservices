package com.example.events_users_microservices.controller;

import com.example.events_users_microservices.dto.ApiResponseBody;
import com.example.events_users_microservices.entity.UserEntity;
import com.example.events_users_microservices.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class userController {

    @Autowired
    UserServices userServices;

    @PostMapping("")
    public ApiResponseBody<UserEntity> createUser(@RequestBody UserEntity requestBody){
        UserEntity createdUser = userServices.createUser(requestBody);
        return new ApiResponseBody<>("success", createdUser, "User Created successfully");

    }

    @GetMapping("")
    public ApiResponseBody<List<UserEntity>> getAllUser(){
        List<UserEntity> users =  userServices.getAll();

        return new ApiResponseBody<>("success", users, "Users retrived successfully!");
    }

    @GetMapping("/id")
    public ApiResponseBody<UserEntity> getUser(@PathVariable("id") int id,
                                               @RequestBody UserEntity requestBody){
        UserEntity updatedUser = userServices.updateOne(id,requestBody);
        return new ApiResponseBody<>("success", updatedUser,"User Updated successfully!");
    }

    @DeleteMapping("/id")
    public ApiResponseBody<Void> deleteUser(@PathVariable("id") int id){
        userServices.delete(id);

        return new ApiResponseBody<>("success", null, "User deleted successfully!!");
    }


}
