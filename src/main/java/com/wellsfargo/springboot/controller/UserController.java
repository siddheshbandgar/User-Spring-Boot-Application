package com.wellsfargo.springboot.controller;

import com.wellsfargo.springboot.model.User;
import com.wellsfargo.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> fetchAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("{id}")
    public User fetchUserById(@PathVariable String id){
        return userService.getUserById(id);
    }

    @DeleteMapping("{id}")
    public  deleteUser(@PathVariable String id){
        return userService.deleteUser(id);

    }

    @PutMapping("{id}")
    public User updateUser(@PathVariable String id, @ResponseBody User modifiedUserDetails ){
        return userService.updateUser(id, modifiedUserDetails);

    }

    @PostMapping
    public User addUser(@ResponseBody User userDetails){
        return userService.addUser(userDetails);

    }
}
