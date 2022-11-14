package com.wellsfargo.springboot;

import com.wellsfargo.springboot.model.Gender;
import com.wellsfargo.springboot.model.User;
import com.wellsfargo.springboot.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository){
		return args -> {
			User user = new User(
					"John",
					"Doe",
					"john@gmail.com",
					LocalDate.of(1992, 1, 13),
					Gender.MALE,
					"Russia"
			);
			userRepository.insert(user);
		};
	}

}
