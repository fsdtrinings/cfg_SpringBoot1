package com.abc.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.test.entity.Movie;
import com.abc.test.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepository movieRepository;

	
	@Override
	public Movie insertMovie(Movie movie) {
		 return movieRepository.save(movie);
	}

	
	
	
	@Override
	public Movie getbyId(int id) {
		return movieRepository.findById(id).get();
	}




	@Override
	public Movie updateStatus(int movieId, boolean status) {
		 Movie movie = movieRepository.findById(movieId)
	                .orElseThrow(() ->
	                    new RuntimeException("Movie not found with id: " + movieId));

	        movie.setStatus(status);

	        return movieRepository.save(movie);
	}

	@Override
	public int getMovieCollection(int movieId) {
		Movie movie = movieRepository.findById(movieId)
                .orElseThrow(() ->
                    new RuntimeException("Movie not found with id: " + movieId));

        return movie.getCollection();
	}

	@Override
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	
	
	
}
