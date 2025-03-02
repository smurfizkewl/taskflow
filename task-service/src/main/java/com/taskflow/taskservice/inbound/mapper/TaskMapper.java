package com.taskflow.taskservice.inbound.mapper;

import com.taskflow.taskservice.core.model.TaskCore;
import com.taskflow.taskservice.inbound.dto.TaskRequestDto;
import com.taskflow.taskservice.inbound.dto.TaskResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);

    TaskCore requestDtoToCore(TaskRequestDto requestDto);

    TaskResponseDto coreToResponseDto(TaskCore taskCore);

    List<TaskResponseDto> coreListToResponseDtoList(List<TaskCore> taskCoreList);
}
