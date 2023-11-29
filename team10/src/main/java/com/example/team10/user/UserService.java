package com.example.team10.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return userRepository.findAll();
//        return List.of(
//                new Flashcard(
//                        1,
//                        "front text",
//                        "back text",
//                        1
//                )
//        );
    }
    public boolean addUser(User user) {
        userRepository.save(user);
        return true;
    }
    public User getUser(Long id){
        Optional<User> foundUser = userRepository.findById(id);
        if (foundUser.isEmpty()){

            throw new IllegalStateException("User does not exist");
        }
        //Optional is a wrapper class that will be empty if user is not found, .get() returns the contained User
        return foundUser.get();
    }
    public void deleteUser(Long userID){
        boolean exists = userRepository.existsById(userID);
        if(!exists){
            throw new IllegalStateException("User with id " + userID + " does not exist");
        }
        userRepository.deleteById(userID);
    }
    public boolean validateLogin(String username, String password) {
        Optional<User> user = userRepository.findByUsername(username);
        return user.map(value -> value.getPassword().equals(password)).orElse(false);
    }



}
