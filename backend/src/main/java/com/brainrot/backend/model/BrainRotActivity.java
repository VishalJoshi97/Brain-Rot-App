package com.brainrot.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BrainRotActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String activityType;//quiz/puzzle/voice
    private int score;

    @ManyToOne//many activity to one user
    @JoinColumn(name="user_id")
    private User user;
}
