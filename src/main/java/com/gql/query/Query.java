package com.gql.query;

import com.gql.models.Book;
import com.gql.services.BookService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    BookService bookService;

    Book getBook(String id)  {
        return bookService.getBookById(id);
    }
}
