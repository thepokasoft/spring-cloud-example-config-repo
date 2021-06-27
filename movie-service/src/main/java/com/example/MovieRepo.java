/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;

/**
 *
 * @author milandeket
 */

public interface MovieRepo{
    public Movie findByMovieId(Long movieId);

    Collection<Movie> findAll();

    void deleteAll();

    void save(Movie the_shawshank_redemption);
}