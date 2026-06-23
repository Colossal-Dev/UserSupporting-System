package com.exception.system.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class CommentResponseDTO {
    private Long id;
    private String content;
    private String createdBy;
    private String role;
    private LocalDateTime createdAt;
}