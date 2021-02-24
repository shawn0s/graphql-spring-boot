package com.gql.services;

import com.gql.models.Book;
import com.gql.repositories.BookReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookReposity bookReposity;

    public Book getBookById(String id) {
        Optional<Book> bookOpt= bookReposity.findById(id);
        return bookOpt.orElse(null);

    }

    public List<Book> getAllBooks(){
        return bookReposity.findAll();
    }
    public Book update(Book book){
        return bookReposity.save(book);
    }

    public Book create(Book book){
        return bookReposity.save(book);
    }

    public String delete(String id){
        bookReposity.deleteById(id);
        return "success";
    }

}
