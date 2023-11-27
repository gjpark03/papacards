@Service 
public class SignUpService {
    @Autowired
    private UserRepository userRepository;

    public boolean createUser(User user) {
        userRepository.save(user);
        return true;
    }
}