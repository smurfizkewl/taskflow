package com.taskflow.taskservice.core.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskCore {

    private Long id;
    private String title;
    private String description;
    private boolean completed;

    @Enumerated(EnumType.STRING)
    private TaskStatusEnum status;

    public enum TaskStatusEnum {
        PENDING, IN_PROGRESS, COMPLETED, CANCELED
    }
}
