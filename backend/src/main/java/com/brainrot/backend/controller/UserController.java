package com.brainrot.backend.controller;

import com.brainrot.backend.service.UserService;
import com.brainrot.backend.dto.UserDTO;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
private final UserService userService;

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }
    @GetMapping
    public List<UserDTO> getUsers() {
        return userService.getAllUsers();
    }
}
