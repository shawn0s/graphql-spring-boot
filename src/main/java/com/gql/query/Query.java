package com.gql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.gql.models.Book;
import com.gql.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;

public class Query implements GraphQLQueryResolver {

    @Autowired
    BookService bookService;

    Book getBook(String id) throws Exception {
        return bookService.getBookById(id);
    }
}
