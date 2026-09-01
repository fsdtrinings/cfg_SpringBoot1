package com.abc.test.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.abc.test.entity.Movie;
import com.abc.test.service.MovieService;



@RestController
@RequestMapping("/admin/movies")
//@CrossOrigin(origins = "http://localhost:3000")
public class MovieController {

	@Autowired
    MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    
    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable int id)
    {
    	return movieService.getbyId(id);
    }
    
    
   
   
    @PostMapping
    public Movie insertMovie(@RequestBody Movie movie) {

        return movieService.insertMovie(movie);
    }

    @GetMapping("")
    public List<Movie> getAll(){

        return movieService.getAllMovies();
    }
    @GetMapping("/name/{movieName}")
    public Movie getMovieByName(
            @PathVariable String movieName) {

        return movieService.getMovieByName(movieName);
    }
    
    @PutMapping("/{movieId}/status")
    public Movie updateStatus(
            @PathVariable int movieId,
            @RequestParam boolean status) {

        return movieService.updateStatus(movieId, status);
    }

   
    @GetMapping("/{movieId}/collection")
    public int getMovieCollection(
            @PathVariable int movieId) {

        return movieService.getMovieCollection(movieId);
    }
}