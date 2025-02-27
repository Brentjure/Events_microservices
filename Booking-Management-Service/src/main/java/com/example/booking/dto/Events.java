package com.example.booking.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Events {

    @JsonProperty("event_id")
    public int eventId;

    @JsonProperty("title")
    public String title;

    @JsonProperty("details")
    public String details;

    @JsonProperty("event_date")
    public LocalDate eventDate;

    @JsonProperty("location")
    public String location;

    @JsonProperty("price")
    public int price;

    @JsonProperty("availability")
    public boolean availability;

    @JsonProperty("max_number")
    public int maxNumber;

    @JsonProperty("event_organiser")
    public int eventOrganiser;

}
