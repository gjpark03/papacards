package com.example.team10.flashcard;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlashcardService {
    //business layer.
    public List<Flashcard> getFlashcards(){
        return List.of(new Flashcard(1L, "Demo term", "demo definition", 1 ));
    }
}
