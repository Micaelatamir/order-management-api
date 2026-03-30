package com.micaela.ordermanagementapi.controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.micaela.ordermanagementapi.model.User;
import com.micaela.ordermanagementapi.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }
    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAll();
    }
}
