package com.bookmyshow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmyshow.entity.Movies;

public interface MovieRepository extends JpaRepository<Movies, Long> {

	public Movies findMovieByName(String name);

	public Movies findMovieByMovieId(Long id);

	public List<Movies> findMovieByNameAndCategory(String name, String category);
}
