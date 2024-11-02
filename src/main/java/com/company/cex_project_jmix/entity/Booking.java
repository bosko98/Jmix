package com.company.cex_project_jmix.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "BOOKING")
@Entity(name = "Booking")
public class Booking {
    @JmixGeneratedValue
    @Id
    @Column(name = "BOOKING_ID")
    private UUID id;

    @JoinColumn(name = "CUSTOMER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private com.company.cex_project_jmix.entity.Customer customer;

    @Column(name = "MOVIE_TIME")
    private LocalDateTime movieTime;

    @JoinColumn(name = "SEAT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private com.company.cex_project_jmix.entity.Seat seat;

    @Column(name = "PAYMENT_STATUS")
    private String paymentStatus;

    @JoinColumn(name = "SNACK_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private com.company.cex_project_jmix.entity.Snack snackName;

    // Getters and Setters

    public void setSnackName(Snack snackName) {
        this.snackName = snackName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public com.company.cex_project_jmix.entity.Customer getCustomer() {
        return customer;
    }

    public void setCustomer(com.company.cex_project_jmix.entity.Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(LocalDateTime movieTime) {
        this.movieTime = movieTime;
    }

    public com.company.cex_project_jmix.entity.Seat getSeat() {
        return seat;
    }

    public void setSeat(com.company.cex_project_jmix.entity.Seat seat) {
        this.seat = seat;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Snack getSnackName() {
        return snackName;
    }
}
