package com.abc.test.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.test.entity.Movie;



public interface MovieRepository extends JpaRepository<Movie, Integer> {

	public Movie findByMovieName(String movieName);
}