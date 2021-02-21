package com.gql.repositories;

import com.gql.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookReposity extends MongoRepository<Book, String> {

}
