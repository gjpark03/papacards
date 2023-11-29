package com.example.team10.flashcard;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
        //This is an example of data validation by testing to see if the data is present
        //We need this for user
        Optional<Flashcard> flashcardByFrontText =
                flashcardRepository.findFlashcardByFrontText(flashcard.getFrontText());
        if(flashcardByFrontText.isPresent()){
            throw new IllegalStateException("Flashcard text taken");
        }
        flashcardRepository.save(flashcard);

//        System.out.println(flashcard);
    }

    public void deleteFlashcard(Long flashcardId){
        boolean exists = flashcardRepository.existsById(flashcardId);
        if(!exists){
            throw new IllegalStateException("Flashcard with id " + flashcardId + " does not exist");
        }
        flashcardRepository.deleteById(flashcardId);
    }

    @Transactional
    public void updateFlashcard(Long flashcardId, String frontText, String backText){
        Flashcard flashcard = flashcardRepository.findById(flashcardId)
                .orElseThrow(() -> new IllegalStateException("Flashcard with id " + flashcardId + " does not exist"));
        //this is how it would be used for regular front text and back text
        if(frontText != null && !frontText.isEmpty() && !Objects.equals(flashcard.getFrontText(), frontText)){
            flashcard.setFrontText(frontText);
        }

        if(backText != null && !backText.isEmpty() && !Objects.equals(flashcard.getBackText(), backText)){
            flashcard.setBackText(backText);
        }

        //this is how it should be set up for user info that cannot be duplicated using function created in repository
        if(frontText != null && !frontText.isEmpty() && !Objects.equals(flashcard.getFrontText(), frontText)){
            Optional<Flashcard> flashcardOptional = flashcardRepository.findFlashcardByFrontText(frontText);
            if(flashcardOptional.isPresent()){
                throw new IllegalStateException("Front text taken");
            }

            flashcard.setFrontText(frontText);
        }
    }
    public List<Flashcard> searchFlashcards(String text) {
        return flashcardRepository.findByFrontTextContaining(text);
    }
}
