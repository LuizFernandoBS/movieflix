package com.devsuperior.movieflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@EnableCaching
@SpringBootApplication( exclude = { SecurityAutoConfiguration.class } )
public class MovieflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieflixApplication.class, args);
	}

}
