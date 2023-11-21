package com.example.team10.flashcard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlashcardService {
    //business layer.
    private final FlashcardRepository flashcardRepository;

    @Autowired
    public FlashcardService(FlashcardRepository flashcardRepository) {
        this.flashcardRepository = flashcardRepository;
    }

    public List<Flashcard> getFlashcards(){
        return flashcardRepository.findAll();
//        return List.of(
//                new Flashcard(
//                        1,
//                        "front text",
//                        "back text",
//                        1
//                )
//        );
    }
    public void addNewFlashcard(Flashcard flashcard) {
        System.out.println(flashcard);
    }
}
