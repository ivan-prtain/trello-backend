package com.example.trellobackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.trellobackend.model.Board;
import com.example.trellobackend.repository.BoardRepository;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TrelloBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrelloBackendApplication.class, args);
	}

	@Bean
	CommandLineRunner init(BoardRepository repository) {
		return args -> {
			repository.save(new Board(null, "Good Project"));
			repository.save(new Board(null, "Bad Project"));
			repository.save(new Board(null, "Mediocre Project"));
			repository.save(new Board(null, "Another Project"));
			repository.save(new Board(null, "Relaxed Project"));
			repository.save(new Board(null, "Angry Project"));
		};
	}

}
