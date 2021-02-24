package com.gql.config;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.gql.mutation.Mutation;
import com.gql.query.BookResolver;
import com.gql.query.Query;
import com.gql.repositories.AuthorRepository;
import com.gql.services.BookService;
import graphql.kickstart.tools.SchemaParser;
//import graphql.scalars.ExtendedScalars;
//import graphql.scalars.datetime.DateTimeScalar;
import graphql.kickstart.tools.SchemaParserOptions;
import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchemaConfig {

    @Bean
    public SchemaParserOptions schemaParserOptions(){
        return SchemaParserOptions.newOptions().objectMapperConfigurer((mapper, context) -> {
            mapper.registerModule(new JavaTimeModule());
        }).build();
    }

    @Bean
    public GraphQLScalarType dateTimeScalar() {
        return ExtendedScalars.Date;
    }
}
