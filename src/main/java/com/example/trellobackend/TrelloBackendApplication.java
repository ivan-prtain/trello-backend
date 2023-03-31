package com.example.trellobackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.trellobackend.model.Board;
import com.example.trellobackend.model.BoardColumns;
import com.example.trellobackend.model.Cards;
import com.example.trellobackend.repository.BoardColumnsRepository;
import com.example.trellobackend.repository.BoardRepository;
import com.example.trellobackend.repository.CardsRepository;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:4200")
public class TrelloBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrelloBackendApplication.class, args);
	}

	@Bean
	CommandLineRunner init(BoardRepository boardRepository, BoardColumnsRepository boardDetailsRepository,
			CardsRepository cardsRepository) {
		return args -> {
			boardRepository.save(new Board(null, "Good Project"));
			boardRepository.save(new Board(null, "Bad Project"));
			boardRepository.save(new Board(null, "Mediocre Project"));
			boardRepository.save(new Board(null, "Another Project"));
			boardRepository.save(new Board(null, "Relaxed Project"));
			boardRepository.save(new Board(null, "Angry Project"));

			boardDetailsRepository.save(new BoardColumns(null, "Todos of goodproject", 1));
			boardDetailsRepository.save(new BoardColumns(null, "Todos2 of badproject", 2));
			boardDetailsRepository.save(new BoardColumns(null, "done and over of badproject", 2));
			boardDetailsRepository.save(new BoardColumns(null, "Todos3", 3));
			boardDetailsRepository.save(new BoardColumns(null, "Todos4", 4));
			boardDetailsRepository.save(new BoardColumns(null, "Todos5", 5));
			boardDetailsRepository.save(new BoardColumns(null, "Todos 6", 6));

			cardsRepository.save(new Cards(null, "Task1", "SpecialTask", 1));

			cardsRepository.save(new Cards(null, "Task1", "Description of task 1", 2));
			cardsRepository.save(new Cards(null, "Task2", "Description of task 2", 2));
			cardsRepository.save(new Cards(null, "Task3", "Description of task 3", 2));
			cardsRepository.save(new Cards(null, "Task4", "Description of task 4", 2));
			cardsRepository.save(new Cards(null, "Task5", "This was done long time ago", 3));

		};
	}

}
