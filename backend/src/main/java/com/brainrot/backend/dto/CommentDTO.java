package com.brainrot.backend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {

    private Long id;

    private Long memeId;

    private Long userId;

    private String text;

}
