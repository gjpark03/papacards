package com.example.team10.flashcard;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class FlashcardConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            FlashcardRepository repository){
        return args -> {
            Flashcard test = new Flashcard(
                    1,
                    "front text",
                    "back text",
                    1
            );
            Flashcard test2 = new Flashcard(
                    "front text 2",
                    "back text 2",
                    2
            );

            repository.saveAll(
                    List.of(test, test2)
            );
        };
    }
}
