package com.gql.services;

import com.gql.models.Book;
import com.gql.repositories.BookReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookReposity bookReposity;

    public Book getBookById(String id) throws Exception{
        return bookReposity.findById(id)
                .orElseThrow(()-> new Exception("The Book is not found"));
    }

}
