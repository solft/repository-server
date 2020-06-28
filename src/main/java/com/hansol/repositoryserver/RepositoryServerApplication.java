package com.hansol.repositoryserver;

import com.hansol.repositoryserver.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class RepositoryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepositoryServerApplication.class, args);
    }

}
