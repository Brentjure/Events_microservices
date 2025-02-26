package com.example.events_users_microservices.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    @JsonProperty("user_id")
    public int userId;

    @Column(name = "user_name")
    @JsonProperty("user_name")
    public String userName;

    @Column(name="email")
    @JsonProperty("email")
    public String email;

    @Column(name="password")
    @JsonProperty("password")
    public String password;

    @Column(name="phone_number")
    @JsonProperty("phone_number")
    public String phoneNumber;

    @Column(name="role")
    @JsonProperty("role")
    public String role;

    public UserEntity() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
