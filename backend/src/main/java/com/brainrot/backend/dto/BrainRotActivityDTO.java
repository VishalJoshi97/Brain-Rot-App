package com.brainrot.backend.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BrainRotActivityDTO {
    private Long id;
    private String activityType;
    private int score;
}
