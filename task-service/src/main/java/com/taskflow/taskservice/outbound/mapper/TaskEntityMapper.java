package com.taskflow.taskservice.outbound.mapper;

import com.taskflow.taskservice.core.model.TaskCore;
import com.taskflow.taskservice.outbound.entity.TaskEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TaskEntityMapper {

    TaskEntityMapper INSTANCE = Mappers.getMapper(TaskEntityMapper.class);

    TaskEntity coreToEntity(TaskCore taskCore);

    TaskCore entityToCore(TaskEntity entity);

    List<TaskCore> entityListToCoreList(List<TaskEntity> taskEntityList);
}
