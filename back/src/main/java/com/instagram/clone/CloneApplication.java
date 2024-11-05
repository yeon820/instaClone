package com.instagram.clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class CloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloneApplication.class, args);
	}

}
