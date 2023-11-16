package final_project;

import java.util.ArrayList;
import java.util.List;

public class FlashcardSet {
    private List<Flashcard> flashcards;
    private User user;

    // Constructor
    public FlashcardSet(User user) {
        this.flashcards = new ArrayList<>();
        this.user = user;
    }

    // Method to add a flashcard
    public void addFlashcard(Flashcard flashcard) {
        flashcards.add(flashcard);
    }

    // Method to remove a flashcard
    public void removeFlashcard(Flashcard flashcard) {
        flashcards.remove(flashcard);
    }

    // Method to get all flashcards
    public List<Flashcard> getFlashcards() {
        return flashcards;
    }

    // Method to get the count of flashcards
    public int getFlashcardCount() {
        return flashcards.size();
    }
}
