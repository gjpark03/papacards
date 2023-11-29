package com.example.team10.flashcard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FlashcardRepository
        extends JpaRepository<Flashcard, Long> {
    @Query("SELECT f FROM Flashcard f WHERE f.frontText = ?1")
    Optional<Flashcard> findFlashcardByFrontText(String frontText);
    List<Flashcard> findByFrontTextContaining(String text);
}
