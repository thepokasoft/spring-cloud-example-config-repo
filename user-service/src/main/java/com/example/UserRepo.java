/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

/**
 *
 * @author milandeket
 */
public interface UserRepo {

	List<User> findAll();

	User findOne(Long userId);
}
