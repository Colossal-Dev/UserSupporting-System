package com.exception.system.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public class DeveloperAssignmentDTO {

        private Long id;

        private String username;

        private long activeTickets;

        private boolean available;
    }

