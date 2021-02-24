package com.gql.query;

import com.gql.models.Author;
import com.gql.models.Book;
import com.gql.repositories.AuthorRepository;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class BookResolver implements GraphQLResolver<Book> {

    @Autowired
    AuthorRepository authorRepository;

    public Author getAuthor(Book book){
        if(book==null || book.getAuthorId()==null){
            return null;
        }
       return authorRepository.findById(book.getAuthorId()).orElseGet(null);
    }

}
