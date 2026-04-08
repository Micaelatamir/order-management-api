package com.micaela.ordermanagementapi.controller;
import com.micaela.ordermanagementapi.dto.request.UserRequestDTO;
import com.micaela.ordermanagementapi.model.User;
import com.micaela.ordermanagementapi.dto.response.UserResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.micaela.ordermanagementapi.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserResponseDTO> findAll() {
        return userService.findAll()
                .stream()
                .map(UserResponseDTO::new)
                .toList();
    }

    @GetMapping("/{id}")
    public UserResponseDTO findById(@PathVariable Long id) {
        return new UserResponseDTO(userService.findById(id));
    }

    @PostMapping
    public UserResponseDTO save(@RequestBody UserRequestDTO dto) {
        User user = new User(dto.getName(), dto.getEmail(), dto.getPassword());
        return new UserResponseDTO(userService.save(user));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }

}