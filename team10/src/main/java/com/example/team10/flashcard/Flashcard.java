package com.example.team10.flashcard;

import jakarta.persistence.*;

@Entity
@Table
public class Flashcard {
    //assuming this makes it the PK NOT NULL
    @Id
    @SequenceGenerator( name  = "flashcard_sequence", sequenceName = "flashcard_sequence", allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "flashcard_sequence")
    private long flashcardId;

    private String frontText;
    private String backText;

    private int setID;

    //private FlashcardSet flashcardSet;

    // Constructor
    public Flashcard(long flashcardId, String frontText, String backText, int setID) {
        this.flashcardId = flashcardId;
        this.frontText = frontText;
        this.backText = backText;
        this.setID = setID;
    }
    public Flashcard(){

    }
    public Flashcard( String frontText, String backText, int setID) {
        this.frontText = frontText;
        this.backText = backText;
        this.setID = setID;
    }

    // Getters
    public long getFlashcardId() {
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

    @Override
    public String toString() {
        return "Flashcard{" +
                "flashcardId=" + flashcardId +
                ", frontText='" + frontText + '\'' +
                ", backText='" + backText + '\'' +
                ", setID=" + setID +
                '}';
    }
}
