package com.abc.test.dto;


import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTO {

    private int movieId;

    private String movieName;

    private String language;

    private List<String> starCastName;

    private LocalDate releaseDate;

    private boolean status;

    private int ticketCost;

    private int collection;
}