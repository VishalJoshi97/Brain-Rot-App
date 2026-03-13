package com.brainrot.backend.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class BrainRotTestResultDTO {
    private Long id;
    private int totalScore;
    private String rotLevel;
    private LocalDateTime takenAt;

}
