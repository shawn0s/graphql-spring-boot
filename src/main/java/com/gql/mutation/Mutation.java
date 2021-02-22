package com.gql.mutation;

import com.gql.models.Book;
import com.gql.models.BookInput;
import com.gql.services.BookService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    BookService bookService;

    public Book createBook(BookInput bookInput){
        Book book = new Book();
        book.setName(bookInput.getName());
        book.setDescription(bookInput.getDescription());
        return bookService.create(book);
    }

}
