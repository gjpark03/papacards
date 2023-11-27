import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;


// How can I write a LoginValidation class to handle the logic of user authentication with SpringBoot? prompt (9 lines). ChatGPT, 26 Nov. version OpenAI, 26 Nov. 2023, chat.openai.com/chat.
@Service
public class LoginValidation {
    @Autowired
    private UserRepository UserRepository;
    
    public boolean validateLogin(String username, String password) {
        Optional<User> user = userRepository.findByUsername(username);
        return user.map(value -> value.getPassword().equals(password)).orElse(false);
    }
}