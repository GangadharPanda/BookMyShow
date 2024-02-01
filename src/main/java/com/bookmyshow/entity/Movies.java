package com.bookmyshow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movies {
	@Id
	private long movieId;
	private String name;
	private String description;
	private String category;
	private double rating;
	private String language;
	private int duration;

}
