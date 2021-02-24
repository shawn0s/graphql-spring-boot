package com.gql.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "Book")
public class Book {

    @Id
    private String id;
    private String name;
    private String description;
    private String authorId;
    private LocalDate createdAt;
}
