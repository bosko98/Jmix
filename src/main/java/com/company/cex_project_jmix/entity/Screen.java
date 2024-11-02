package com.company.cex_project_jmix.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.UUID;

@JmixEntity
@Table(name = "SCREEN")
@Entity(name = "Screen")
public class Screen {
    @JmixGeneratedValue
    @Id
    @Column(name = "SCREEN_ID")
    private UUID id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "TOTAL_SEATS")
    private Integer totalSeats;

    @JoinColumn(name = "MOVIE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private com.company.cex_project_jmix.entity.Movie movie;

    // Getters and Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }

    public com.company.cex_project_jmix.entity.Movie getMovie() {
        return movie;
    }

    public void setMovie(com.company.cex_project_jmix.entity.Movie movie) {
        this.movie = movie;
    }
}
