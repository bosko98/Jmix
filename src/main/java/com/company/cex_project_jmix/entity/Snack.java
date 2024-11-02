package com.company.cex_project_jmix.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@JmixEntity
@Table(name = "SNACK")
@Entity
public class Snack {
    @JmixGeneratedValue
    @Id
    @Column(name = "SNACK_ID")
    private UUID id;

    @Column(name = "SNACK_NAME", nullable = false)
    private String snackName;

    @Column(name = "SNACK_TYPE", nullable = false)
    private String snackType;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "SIZE")
    private String size;

    // Getters and Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public String getSnackType() {
        return snackType;
    }

    public void setSnackType(String snackType) {
        this.snackType = snackType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return snackName;
    }
}