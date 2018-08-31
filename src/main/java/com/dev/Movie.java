package com.dev;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies_info")
public class Movie {
	
	@Id
	@Column(name="movie_id")
	private int movie_id;
	
	@Column(name = "movie_name")
	private String name;
	@Column(name = "movie_summery")
	private String summery;
	@Column(name = "movie_rating")
	private int rating;
	public int getId() {
		return movie_id;
	}
	public void setId(int id) {
		this.movie_id = id;
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
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [id=" + movie_id + ", name=" + name + ", summery=" + summery + ", rating=" + rating + "]";
	}
	
}
