package com.brainrot.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BrainRotAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String selectedAnswer;
    private boolean correct;

    private long responseTimeMillis;

    @ManyToOne
    private BrainRotQuestion question;

    @ManyToOne
    private BrainRotTest test;
}
