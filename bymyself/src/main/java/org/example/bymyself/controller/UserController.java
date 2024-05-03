package org.example.bymyself.controller;

import org.example.bymyself.dto.request.UserCreationRequest;
import org.example.bymyself.entity.User;
import org.example.bymyself.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    User createUser(@RequestBody UserCreationRequest request){
        return userService.createRequest(request);
    }

    @GetMapping
    List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
