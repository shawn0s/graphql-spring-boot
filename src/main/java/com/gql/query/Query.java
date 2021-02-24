package com.gql.query;

import com.gql.models.Book;
import com.gql.services.BookService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {

    @Autowired
    BookService bookService;

    Book getBook(String id)  {
        Book book =bookService.getBookById(id);
        return book;
    }

    List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
}
