package com.gql.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Author")
public class Author {
    private String id;
    private String firstName;
    private String lastName;
}
