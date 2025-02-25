package com.taskflow.taskservice.core.service;

import com.taskflow.taskservice.core.model.TaskCore;
import com.taskflow.taskservice.core.port.in.TaskServicePort;
import com.taskflow.taskservice.core.port.out.TaskRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServicePortAdapter implements TaskServicePort {

    private final TaskRepositoryPort taskRepository;

    @Override
    public TaskCore createTask(TaskCore taskCore) {
        return taskRepository.save(taskCore);

    }

    @Override
    public List<TaskCore> fetchAllTasks() {
        return taskRepository.fetchAll();
    }
}
