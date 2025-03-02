package com.taskflow.taskservice.core.port.out;

import com.taskflow.taskservice.core.model.TaskCore;

import java.util.List;

public interface TaskRepositoryPort {

    TaskCore save(TaskCore task);

    List<TaskCore> fetchAll();
}
