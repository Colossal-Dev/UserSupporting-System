package com.exception.system.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateProfileResponse {
    private Long id;
    private String username;
    private String email;
    private String role;
    private String token;
}