package com.wellsfargo.springboot.service;

import com.wellsfargo.springboot.exception.ResourceNotFoundException;
import com.wellsfargo.springboot.model.User;
import com.wellsfargo.springboot.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepository repository;

    public List<User> getAllUsers(){
        return repository.findAll();
    }

    public User getUserById(String id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee does not exist with id: "+id));
    }

    public User updateUser(String id, User modifiedUserDetails){

    }

    public User deleteUser(String id){

    }

    public User addUser(User userDetails){

        return repository.save(userDetails);

    }


}
