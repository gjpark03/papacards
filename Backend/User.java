package final_project;
import java.util.ArrayList;
import java.util.List;


public class User {
	private String username;
	private Integer userID;
	private String email;
	private String password;
	private List<FlashcardSet> sets; 
	private List<User> friends;  
	private List<Flashcard> flashcards;
	
	
	// user constructor 
    public User(String username, String email, String password, Integer userID) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.userID = userID;
        
        // Initialize the lists
        this.sets = new ArrayList<>();
        this.friends = new ArrayList<>();
        this.flashcards = new ArrayList<>();
    }
    
    // Getters
    public String getUsername() {
        return username;
    }
    
    public Integer getID() {
    	return userID;
    }
 
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<FlashcardSet> getSets() {
        return sets;
    }

    public List<User> getFriends() {
        return friends;
    }

    public List<Flashcard> getFlashcards() {
        return flashcards;
    }
    
    // Setters
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setUserID(Integer userID) {
    	this.userID = userID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSets(List<FlashcardSet> sets) {
        this.sets = sets;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public void setFlashcards(List<Flashcard> flashcards) {
        this.flashcards = flashcards;
    }
    
    // methods to add and remove items from lists
    public void addSet(FlashcardSet set) {
        this.sets.add(set);
    }

    public void removeSet(FlashcardSet set) {
        this.sets.remove(set);
    }

    public void addFriend(User friend) {
        this.friends.add(friend);
    }

    public void removeFriend(User friend) {
        this.friends.remove(friend);
    }

    public void addFlashcard(Flashcard flashcard) {
        this.flashcards.add(flashcard);
    }

    public void removeFlashcard(Flashcard flashcard) {
        this.flashcards.remove(flashcard);
    }
}

