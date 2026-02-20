package com.brainrot.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bio;

    private String profilePictureUrl;

    private int totalCore;

    @OneToOne
    @JoinColumn(name = "user_id",nullable = false,unique = true)
    private User user;
}
