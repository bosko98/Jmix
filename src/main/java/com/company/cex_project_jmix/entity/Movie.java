package com.company.cex_project_jmix.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.UUID;

@JmixEntity
@Table(name = "MOVIE")
@Entity(name = "Movie")
public class Movie {
    @JmixGeneratedValue
    @Id
    @Column(name = "MOVIE_ID")
    private UUID id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "GENRE")
    private String genre;

    @Column(name = "DURATION")
    private Integer duration;

    @Column(name = "RELEASE_DATE")
    private LocalDate releaseDate;

    // Getters and Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
