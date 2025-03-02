package com.taskflow.taskservice.outbound.repository;

import com.taskflow.taskservice.outbound.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
