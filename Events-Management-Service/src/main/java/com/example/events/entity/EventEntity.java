package com.example.events.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="events")
@Data
@NoArgsConstructor
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="event_id")
    @JsonProperty("event_id")
    public int eventId;

    @Column(name="title")
    @JsonProperty("title")
    public String title;

    @Column(name="details")
    @JsonProperty("details")
    public String details;

    @Column(name="event_date")
    @JsonProperty("event_date")
    public LocalDate eventDate;

    @Column(name="location")
    @JsonProperty("location")
    public String location;

    @Column(name="price")
    @JsonProperty("price")
    public int price;

    @Column(name="availability")
    @JsonProperty("availability")
    public boolean availability;

    @Column(name="max_number")
    @JsonProperty("max_number")
    public int maxNumber;

    @Column(name="event_organiser")
    @JsonProperty("event_organiser")
    public int eventOrganiser;


}
