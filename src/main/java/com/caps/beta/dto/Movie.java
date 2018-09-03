package com.caps.beta.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="MovieEntity")
@Table(name="movie_info")
public class Movie {
	
	@Id @Column(name="movie_id")
	private int movieId;
	
	@Column(name="movie_name")
	private String name;
	
	@Column(name="movie_summery")
	private String summery;
	
	@Column(name="movie_rating")
	private double rating;
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSummery() {
		return summery;
	}
	public void setSummery(String summery) {
		this.summery = summery;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", name=" + name + ", summery=" + summery + ", rating=" + rating + "]";
	}
}
