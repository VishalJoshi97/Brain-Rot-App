package com.brainrot.backend.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemeDTO {
    private Long id;
    private String title;
    private String imageUrl;
    private int likes;
}
