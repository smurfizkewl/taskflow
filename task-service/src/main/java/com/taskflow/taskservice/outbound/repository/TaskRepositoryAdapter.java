package com.taskflow.taskservice.outbound.repository;

import com.taskflow.taskservice.core.model.TaskCore;
import com.taskflow.taskservice.core.port.out.TaskRepositoryPort;
import com.taskflow.taskservice.outbound.entity.TaskEntity;
import com.taskflow.taskservice.outbound.mapper.TaskEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TaskRepositoryAdapter implements TaskRepositoryPort {
    private final TaskRepository taskRepository;
    private final TaskEntityMapper taskEntityMapper = TaskEntityMapper.INSTANCE;

    @Override
    public TaskCore save(TaskCore taskCore) {
        TaskEntity entity = taskEntityMapper.coreToEntity(taskCore);

        return taskEntityMapper.entityToCore(taskRepository.save(entity));
    }

    @Override
    public List<TaskCore> fetchAll() {
        List<TaskEntity> taskEntityList = taskRepository.findAll();

        return taskEntityMapper.entityListToCoreList(taskEntityList);
    }
}
