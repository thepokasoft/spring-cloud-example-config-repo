/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.springframework.data.neo4j.repository.GraphRepository;

/**
 *
 * @author milandeket
 */
public interface UserRepo {

	Iterable<User> findAll();

	User findOne(Long userId);

	void deleteAll();

	void save(User user);
}
