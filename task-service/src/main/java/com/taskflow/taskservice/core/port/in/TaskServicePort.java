package com.taskflow.taskservice.core.port.in;

import com.taskflow.taskservice.core.model.TaskCore;

import java.util.List;

public interface TaskServicePort {

    TaskCore createTask(TaskCore taskCore);

    List<TaskCore> fetchAllTasks();
}
