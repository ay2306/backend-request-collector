package com.brc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableJpaRepositories
public class BrcApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrcApplication.class, args);
	}

}
