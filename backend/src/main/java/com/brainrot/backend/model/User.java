package com.brainrot.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String name;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false,unique = true)
    private String email;

    //mappedBy = "I have a field, but I don’t own the FK"->user_id as FK in profile
    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private Profile profile;

}
