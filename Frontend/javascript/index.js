document.addEventListener('DOMContentLoaded', () => {
    loadFlashcards();
});

// QUERY FLASHCARD SET SQL TABLE AND RETURN RESULT
function loadFlashcards() {
    // Fetch the flashcard sets from your backend API
    fetch('INSERT_BACKEND_SERVLET_HERE')
    .then(response => response.json())
    .then(sets => {
        sets.forEach(set => {
            document.getElementById('flashcard-sets-container').appendChild(createSetElement(set));
        });
    })
    .catch(error => console.error('Error:', error));
}

function createSetElement(setData) {
    const setElement = document.createElement('div');
    setElement.className = 'flashcard-set';
    setElement.textContent = setData.name;
    setElement.onclick = () => window.location.href = `/studydeckloggedin.html?setID=${setData.setID}`;
    return setElement;
}


function search(){
    //fetch to search servlet harty har har
}
