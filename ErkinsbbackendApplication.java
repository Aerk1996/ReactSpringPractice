package com.erkinrs1.erkinsbbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ErkinsbbackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ErkinsbbackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
			this.userRepository.save(new User("erkin","sahsuvar","erkin@gmail.com"));
		this.userRepository.save(new User("ahmet","bas","ahmet@gmail.com"));}
}
