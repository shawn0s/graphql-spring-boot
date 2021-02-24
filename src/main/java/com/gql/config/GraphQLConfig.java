package com.gql.config;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import graphql.kickstart.tools.SchemaParserOptions;
import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfig {
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
