package com.taskflow.taskservice.core.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskCore {

    private Long id;
    private String title;
    private String description;
    private boolean completed;
}
