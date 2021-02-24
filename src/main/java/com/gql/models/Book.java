package com.gql.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "Book")
public class Book {

    @Id
    private String id;
    private String name;
    private String description;
    private String authorId;
    private Date createdAt;
}
