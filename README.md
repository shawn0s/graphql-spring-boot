# Graphql-Spring-Boot

A simmple graphql demo on spring boot


# Requirements and Downloads

Requirements:

* Java 1.8
* Spring Framework Boot > 2.x.x (web)

# Installation

```bash
$ mvn package
```

Maven dependency:

```xml
<dependency>
            <groupId>com.graphql-java-kickstart</groupId>
            <artifactId>graphql-spring-boot-starter</artifactId>
            <version>11.0.0</version>
        </dependency>
        <!-- to embed GraphiQL tool -->
        <dependency>
            <groupId>com.graphql-java-kickstart</groupId>
            <artifactId>graphiql-spring-boot-starter</artifactId>
            <version>11.0.0</version>
            <scope>runtime</scope>
        </dependency>

        <dependency>
            <groupId>com.graphql-java-kickstart</groupId>
            <artifactId>altair-spring-boot-starter</artifactId>
            <version>11.0.0</version>
            <scope>runtime</scope>
        </dependency>

        <dependency>
            <groupId>com.graphql-java</groupId>
            <artifactId>graphql-java-extended-scalars</artifactId>
            <version>16.0.0</version>
        </dependency>

        <!-- testing facilities -->
        <dependency>
            <groupId>com.graphql-java-kickstart</groupId>
            <artifactId>graphql-spring-boot-starter-test</artifactId>
            <version>11.0.0</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>com.graphql-java-kickstart</groupId>
            <artifactId>graphql-java-tools</artifactId>
            <version>11.0.0</version>
        </dependency>
```

Host url 

**http://localhost:9002/altair**


# Reference 

[graphql-java](https://github.com/graphql-java/graphql-java)

[graphql-spring-boot](https://github.com/graphql-java-kickstart/graphql-spring-boot)

[graphql-java-tools](https://github.com/graphql-java-kickstart/graphql-java-tools)

[graphql-java-servlet](https://github.com/graphql-java-kickstart/graphql-java-servlet)

[graphql-java-extended-scalars](https://github.com/graphql-java/graphql-java-extended-scalars)
