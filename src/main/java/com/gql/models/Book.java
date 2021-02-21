package com.gql.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class Book {

    @Id
    private String id;
    private String name;
    private String description;

}
