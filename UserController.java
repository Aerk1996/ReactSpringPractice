package com.erkinrs1.erkinsbbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("api/")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("users")
    public List<User> getUsers(){
        return this.userRepository.findAll();
    }
}
