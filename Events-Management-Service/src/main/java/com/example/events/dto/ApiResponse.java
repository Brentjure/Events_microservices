package com.example.events.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse<T> {
    public String status;
    public T data;
    public String message;


}
