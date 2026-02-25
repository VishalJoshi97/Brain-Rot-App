package com.brainrot.backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BrainRotTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int totalScore;
    private String rotLevel;

    private LocalDateTime takenAt;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "test", cascade = CascadeType.ALL)
    private List<BrainRotAnswer> answers;
}
