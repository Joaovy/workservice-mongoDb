package com.webServiceNoSQL.bancoNoSQL.repository;

import com.webServiceNoSQL.bancoNoSQL.domain.Post;
import com.webServiceNoSQL.bancoNoSQL.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


}
