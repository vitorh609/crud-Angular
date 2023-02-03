package com.vitorhugo609.crudspring;

import com.vitorhugo609.crudspring.Repository.CourseRepository;
import com.vitorhugo609.crudspring.model.Course;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository){
		return args -> {
			courseRepository.deleteAll();

			Course c = new Course();
			c.setNome("Angular");
			c.setDuracao("10h");

			courseRepository.save(c);
		};
	}
}
