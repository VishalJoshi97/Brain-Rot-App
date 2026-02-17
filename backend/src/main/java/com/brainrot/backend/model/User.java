package com.brainrot.backend.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class User {
    private Long id;
    private String name;
    private String password;
    private String email;
}
