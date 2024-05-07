package org.example.bymyself.controller;

import jakarta.validation.Valid;
import org.example.bymyself.dto.request.ApiResponse;
import org.example.bymyself.dto.request.UserCreationRequest;
import org.example.bymyself.dto.request.UserUpdateRequest;
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
    ApiResponse<User> createUser(@Valid @RequestBody  UserCreationRequest request){
        return ApiResponse.<User>builder()
                .result(userService.createUser(request))
                .build();
    }

    @GetMapping
    List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    User getUserById(@PathVariable String id){
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    User updateUser(@PathVariable String id, @RequestBody UserUpdateRequest request){
        return userService.updateUser(id, request);
    }

    @DeleteMapping("/{id}")
    String deleteUser(@PathVariable String id){
        userService.deleteUser(id);
        return "User deleted successfully";
    }
}
