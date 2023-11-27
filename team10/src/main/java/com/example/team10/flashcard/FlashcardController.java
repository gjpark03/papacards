package com.example.team10.flashcard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "flashcard")
public class FlashcardController {
    private final FlashcardService flashcardService;
    //tells program that above flashcardService will be automatically instantiated and wired to below constructor.
    @Autowired
    public FlashcardController(FlashcardService flashcardService) {
        this.flashcardService = flashcardService;
    }

    @GetMapping //annotation makes the thing a rest endpoint. in this case we just want to GET student.
    //Flashcard(int flashcardId, String frontText, String backText, int setID)
    public List<Flashcard> getFlashcards(){
        return flashcardService.getFlashcards();

    }

    @PostMapping
    public void registerNewFlashcard(@RequestBody Flashcard flashcard){
        flashcardService.addNewFlashcard(flashcard);
    }

    @DeleteMapping(path = "{flashcardId}")
    public void deleteFlashcard(@PathVariable("flashcardId") Long flashcardId){
        flashcardService.deleteFlashcard(flashcardId);
    }

    @PutMapping(path = "{flashcardId}")
    public void updateFlashcard(@PathVariable("flashcardId") Long flashcardId,
                                @RequestParam(required = false) String frontText,
                                @RequestParam(required = false) String backText){
        flashcardService.updateFlashcard(flashcardId, frontText, backText);
    }
}
