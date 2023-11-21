package com.example.team10;

import com.example.team10.flashcard.Flashcard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication

public class Team10Application {

	public static void main(String[] args) {
		SpringApplication.run(Team10Application.class, args);
	}

}

