package com.brainrot.backend.service;

import com.brainrot.backend.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO createUser(UserDTO userDTO);
    List<UserDTO> getAllUsers();
}
