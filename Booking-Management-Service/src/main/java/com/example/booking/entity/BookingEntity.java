package com.example.booking.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name="bookings")
@Data
@NoArgsConstructor
public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    @JsonProperty("booking_id")
    private Long bookingId;

    @Column(name = "event_id", nullable = false)
    @JsonProperty("event_id")
    private Long eventId;

    @Column(name = "user_id", nullable = false)
    @JsonProperty("user_id")
    private Long userId;

    @Column(name = "booking_date", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    @JsonProperty("booking_date")
    private LocalDateTime bookingDate = LocalDateTime.now();

    //@Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    @JsonProperty("status")
    private String status;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_status", nullable = false)
    @JsonProperty("payment_status")
    private String paymentStatus;

    @Column(name = "number_of_tickets", nullable = false)
    @JsonProperty("number_of_tickets")
    private int numberOfTickets;

    @Column(name = "total_price", nullable = false, precision = 10, scale = 2)
    @JsonProperty("total_price")
    private int totalPrice;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", updatable = false)
    @JsonProperty("created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();

}
