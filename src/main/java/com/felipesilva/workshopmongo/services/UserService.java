package com.felipesilva.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipesilva.workshopmongo.domain.User;
import com.felipesilva.workshopmongo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public List<User> findAll() {
		List<User> list = repository.findAll();
		return list;
	}
}
