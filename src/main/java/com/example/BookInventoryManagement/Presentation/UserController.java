package com.example.BookInventoryManagement.Presentation;

import com.example.BookInventoryManagement.Business.User;
import com.example.BookInventoryManagement.Persistence.UserRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class UserController {
    
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/register")
    public void register(@RequestBody User user) {
        User newUser = userRepository.findById(user.getName())
                        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User already exits"));
        newUser.setName(user.getName());
        newUser.setPassword(user.getPassword());
        userRepository.save(newUser);
    }
    
}
