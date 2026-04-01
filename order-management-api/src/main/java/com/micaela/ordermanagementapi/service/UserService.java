package com.micaela.ordermanagementapi.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.micaela.ordermanagementapi.model.User;

@Service
public class UserService {
    private final UserRepositorykk userRepository;
    public UserService(UserRepositorykk userRepository){
        this.userRepository = userRepository;
    }
    public User save(User user){
        return userRepository.save(user);
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }
    }