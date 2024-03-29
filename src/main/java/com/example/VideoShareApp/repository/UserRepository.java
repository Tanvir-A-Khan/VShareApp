package com.example.VideoShareApp.repository;

import com.example.VideoShareApp.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId> {
}
