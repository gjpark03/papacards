let currentCardIndex = 0;
let flashcards = [];

document.addEventListener('DOMContentLoaded', () => {
    loadFlashcardsFromServlet();

    document.getElementById('next-button').addEventListener('click', () => navigateFlashcard(1));
    document.getElementById('prev-button').addEventListener('click', () => navigateFlashcard(-1));
});

function loadFlashcardsFromServlet() {
    // Fetch the flashcards from your Servlet
    fetch('INSERT_BACKEND_SERVLET_HERE_WITH_SETID')
    .then(response => response.json())
    .then(data => {
        flashcards = data;
        displayFlashcard();
    })
    .catch(error => console.error('Error:', error));
}

function displayFlashcard() {
    if (flashcards.length === 0) return; // Check if there are flashcards
    const card = flashcards[currentCardIndex];
    const flashcardContainer = document.getElementById('flashcard-container');
    flashcardContainer.innerHTML = `
        <div class="flashcard" onclick="this.classList.toggle('flipped');">
            <div class="front">
                <p>${card.frontText}</p>
            </div>
            <div class="back">
                <p>${card.backText}</p>
            </div>
        </div>
    `;
}

function navigateFlashcard(direction) {
    currentCardIndex += direction;
    if (currentCardIndex >= flashcards.length) {
        currentCardIndex = 0;
    } else if (currentCardIndex < 0) {
        currentCardIndex = flashcards.length - 1;
    }
    displayFlashcard();
}
