package com.bookmyshow.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyshow.entity.Movies;
import com.bookmyshow.repository.MovieRepository;

@RestController
@RequestMapping(path = "/movie")
public class MovieController {

	private final MovieRepository repository;

	@Autowired
	public MovieController(MovieRepository repository) {
		this.repository = repository;
	}

	@GetMapping(path = "/add")
	public String addMovie() {
		System.out.println("Requeest reached to the server...1");
		repository.save(Movies.builder().
				movieId(1l)
				.name("Lord ganesha")
				.category("Spiritual")
				.duration(100)
				.build());
		return "Saved Successfully";
	}

	@GetMapping(path = "/get")
	public Movies getMovie() {
		System.out.println("Requeest reached to the server...2");
		return repository.findMovieByMovieId(1L);
	}

}
