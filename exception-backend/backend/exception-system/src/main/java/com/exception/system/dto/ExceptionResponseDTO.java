package com.exception.system.dto;

import com.exception.system.entity.Status;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ExceptionResponseDTO {
    private Long id;
    private String title;
    private String description;
    private String priority;
    private Status status;
    private String createdBy;
    private String assignedTo;
    private LocalDateTime createdAt;
}