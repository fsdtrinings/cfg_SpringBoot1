package com.abc.test.entity;



import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;

    private String movieName;

    private String language;

    @ElementCollection
    @CollectionTable(
        name = "movie_star_cast",
        joinColumns = @JoinColumn(name = "movie_id")
    )
    private List<String> starCastName;

    private LocalDate releaseDate;

    private boolean status;

    private int ticketCost;

    private int collection;

    public Movie() {
    }

    public Movie(String movieName, String language,
            List<String> starCastName, LocalDate releaseDate,
            boolean status, int ticketCost, int collection) {

        this.movieName = movieName;
        this.language = language;
        this.starCastName = starCastName;
        this.releaseDate = releaseDate;
        this.status = status;
        this.ticketCost = ticketCost;
        this.collection = collection;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<String> getStarCastName() {
        return starCastName;
    }

    public void setStarCastName(List<String> starCastName) {
        this.starCastName = starCastName;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(int ticketCost) {
        this.ticketCost = ticketCost;
    }

    public int getCollection() {
        return collection;
    }

    public void setCollection(int collection) {
        this.collection = collection;
    }
}