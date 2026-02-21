package com.brainrot.backend.service;

import com.brainrot.backend.dto.UserDTO;
import com.brainrot.backend.model.User;
import com.brainrot.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserDTO createUser(UserDTO dto) {
        User user = User.builder()
                .email(dto.getEmail())
                .name(dto.getName())
                .build();

        user = userRepository.save(user);
        return new UserDTO(user.getId(), user.getEmail(), user.getName() );
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(u->new UserDTO(u.getId(), u.getEmail(), u.getName()))
                .collect(Collectors.toList());
    }
}
