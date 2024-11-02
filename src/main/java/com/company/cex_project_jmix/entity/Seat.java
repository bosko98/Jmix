package com.company.cex_project_jmix.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.UUID;

@JmixEntity
@Table(name = "SEAT")
@Entity(name = "Seat")
public class Seat {
    @JmixGeneratedValue
    @Id
    @Column(name = "SEAT_ID")
    private UUID id;

    @Column(name = "SEAT_NUMBER", nullable = false)
    private String seatNumber;

    @JoinColumn(name = "SCREEN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private com.company.cex_project_jmix.entity.Screen screen;

    @Column(name = "SEAT_TYPE")
    private String seatType;

    // Getters and Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public com.company.cex_project_jmix.entity.Screen getScreen() {
        return screen;
    }

    public void setScreen(com.company.cex_project_jmix.entity.Screen screen) {
        this.screen = screen;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    @Override
    public String toString() {
        return seatNumber;
    }
}
