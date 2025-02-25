package com.taskflow.taskservice.inbound.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskRequestDto {

    private String title;
    private String description;
    private LocalDateTime dueDate;
}
