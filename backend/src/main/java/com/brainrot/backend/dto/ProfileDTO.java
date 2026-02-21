package com.brainrot.backend.dto;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProfileDTO {
    private Long id;
    private String bio;
    private String profilePictureUrl;
    private int totalScore;
    private Long userId;
}
