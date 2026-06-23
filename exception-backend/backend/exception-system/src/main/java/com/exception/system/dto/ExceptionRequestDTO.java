package com.exception.system.dto;

import lombok.Data;

@Data
public class ExceptionRequestDTO {

    private String title;
    private String description;
    private String priority;

}