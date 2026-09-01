package com.abc.test.client;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.abc.test.dto.MovieDTO;



@FeignClient(name = "MOVIE-SERVICE")
public interface MovieFeignClient {

	 @GetMapping("/admin/movies/{id}")
	    MovieDTO getMovieById(
	            @PathVariable("id") int id);


	    @GetMapping("/admin/movies/name/{movieName}")
	    MovieDTO getMovieByName(
	            @PathVariable("movieName") String movieName);
}


//  {MOVIE-SERVICE}/movie/{id}
//  localhost:7001/movie/1