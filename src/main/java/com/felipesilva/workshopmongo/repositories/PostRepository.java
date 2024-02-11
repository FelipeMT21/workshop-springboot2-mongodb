package com.felipesilva.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.felipesilva.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
