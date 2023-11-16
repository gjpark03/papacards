package final_project;

public class Flashcard {
    private int flashcardId;
    private String frontText;
    private String backText;

    // Constructor
    public Flashcard(int flashcardId, String frontText, String backText) {
        this.flashcardId = flashcardId;
        this.frontText = frontText;
        this.backText = backText;
    }

    // Getters
    public int getFlashcardId() {
        return flashcardId;
    }

    public String getFrontText() {
        return frontText;
    }

    public String getBackText() {
        return backText;
    }

    // Setters
    public void setFlashcardId(int flashcardId) {
        this.flashcardId = flashcardId;
    }

    public void setFrontText(String frontText) {
        this.frontText = frontText;
    }

    public void setBackText(String backText) {
        this.backText = backText;
    }

}
