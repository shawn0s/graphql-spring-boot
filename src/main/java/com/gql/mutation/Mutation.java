package com.gql.mutation;

import com.gql.DateUtil;
import com.gql.models.Book;
import com.gql.models.BookInput;
import com.gql.services.BookService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    BookService bookService;

    public Book createBook(BookInput bookInput){
        Book book = new Book();
        book.setName(bookInput.getName());
        book.setDescription(bookInput.getDescription());
        book.setAuthorId(bookInput.getAuthorId());
        book.setCreatedAt(DateUtil.convertToLocalDateViaInstant(new Date()));
        return bookService.create(book);
    }

}
