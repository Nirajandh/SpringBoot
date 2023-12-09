package com.Boot.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.Boot.jpa.entities.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}
