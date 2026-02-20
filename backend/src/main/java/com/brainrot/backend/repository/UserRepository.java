package com.brainrot.backend.repository;

import com.brainrot.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    //findById default
    Optional<User> findByEmail(String email);

    List<User> findByName(String name);
}
