package com.brainrot.backend.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BrainRotTestRequestDTO {
    private Long userId;
    private List<AnswerDTO> answers;
}
