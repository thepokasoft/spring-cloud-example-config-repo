package com.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class MoviRepoImpl implements MovieRepo {
	RecommendationData recommendationData1 = new RecommendationData(1,3);

	@Override
	public List<RecommendationData> getRecommendationForUser(Long followerID) {
		return Collections.singletonList(recommendationData1);
	}

	@Override
	public List<RecommendationData> getTopFiveMovies() {
		return Collections.singletonList(recommendationData1);
	}

	User user1 = new User(1l,Collections.EMPTY_LIST,Collections.EMPTY_LIST,Collections.EMPTY_LIST);
	User user2 = new User(2l,Collections.EMPTY_LIST,Collections.EMPTY_LIST,Collections.EMPTY_LIST);

	Movie movie1 = new Movie(1l,1l,Collections.singletonList(user1),Collections.singletonList(user2));


	@Override
	public List<Movie> findAll() {
		return Collections.singletonList(movie1);
	}

	@Override
	public void deleteAll() {
		System.out.println("Delete is called");
	}

	@Override
	public void save(Movie movie) {
		System.out.println("Save is called");
	}

	@Override
	public Movie findOne(Long movieId) {
		return movie1;
	}
}
