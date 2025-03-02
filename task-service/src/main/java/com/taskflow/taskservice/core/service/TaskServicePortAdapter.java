package com.taskflow.taskservice.core.service;

import com.taskflow.taskservice.core.model.TaskCore;
import com.taskflow.taskservice.core.port.in.TaskServicePort;
import com.taskflow.taskservice.core.port.out.TaskRepositoryPort;
import com.taskflow.taskservice.util.BaseLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServicePortAdapter extends BaseLogger implements TaskServicePort {

    private final TaskRepositoryPort taskRepository;

    @Override
    public TaskCore createTask(TaskCore taskCore) {
        log.info("Creating task: {}", taskCore);

        return taskRepository.save(taskCore);
    }

    @Override
    public List<TaskCore> fetchAllTasks() {
        return taskRepository.fetchAll();
    }
}
