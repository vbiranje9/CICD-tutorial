package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.entity.User;
//import com.example.demo.repository.UserRepository;

@RestController
public class TestController {

//    @Autowired
//    private UserRepository repo;

    @GetMapping("/test-db")
    public String testDb() {
//        User u = new User();
//        u.setName("Vishal");
//        repo.save(u);
        return "Saved!";
    }
}