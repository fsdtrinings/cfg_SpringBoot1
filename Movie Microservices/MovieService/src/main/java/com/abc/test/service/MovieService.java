package com.abc.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.test.entity.Movie;

@Service
public interface MovieService {

	Movie insertMovie(Movie movie);

    Movie updateStatus(int movieId, boolean status);

    int getMovieCollection(int movieId);
    
    List<Movie> getAllMovies();
    
    public Movie getbyId(int id);
}
