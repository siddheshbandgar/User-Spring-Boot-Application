package com.wellsfargo.springboot.repository;

import com.wellsfargo.springboot.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
