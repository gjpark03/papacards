package com.example.team10.user;
package com.example.team10.flashcard;

import com.example.team10.flashcard.Flashcard;
import com.example.team10.flashcard.FlashcardService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "user")
public class UserController {
    private final UserService userService;
    //tells program that above flashcardService will be automatically instantiated and wired to below constructor.
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping //annotation makes the thing a rest endpoint. in this case we just want to GET student.
    //Flashcard(int flashcardId, String frontText, String backText, int setID)
    public List<User> getFlashcards(){
        return userService.getUsers();

    }
    @PostMapping("signup")
    public String register(@ModelAttribute User user, HttpServletResponse response) {
        boolean userCreated = userService.addUser(user);
        if (userCreated) {
            return "redirect:/login"; // redirect to login page after successful registration
        } else {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST); // Set error status
            return "redirect:/signup"; // redirect back to sign-up in case of failure
        }
    }
    @PostMapping
    public String submitLogin(@RequestParam String username, @RequestParam String password) {
        if (userService.validateLogin(username, password)) {
            return ""// redirect to the home page
        }
        else {
            return ""// redirect to the login page, invalid login
        }
    }

}
