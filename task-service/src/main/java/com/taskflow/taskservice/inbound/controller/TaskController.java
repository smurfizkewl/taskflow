package com.taskflow.taskservice.inbound.controller;

import com.taskflow.taskservice.core.model.TaskCore;
import com.taskflow.taskservice.core.port.in.TaskServicePort;
import com.taskflow.taskservice.inbound.dto.TaskRequestDto;
import com.taskflow.taskservice.inbound.dto.TaskResponseDto;
import com.taskflow.taskservice.inbound.mapper.TaskMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskServicePort taskServicePort;
    private final TaskMapper taskMapper;

    @PostMapping
    public ResponseEntity<TaskResponseDto> createTask(@RequestBody TaskRequestDto requestDto) {
        TaskCore taskCoreIn = taskMapper.requestDtoToCore(requestDto);
        TaskCore taskCoreOut = taskServicePort.createTask(taskCoreIn);

        return ResponseEntity.ok(taskMapper.coreToResponseDto(taskCoreOut));
    }

    @GetMapping
    public ResponseEntity<List<TaskResponseDto>> getAllTasks() {
        List<TaskCore> taskCoreList = taskServicePort.fetchAllTasks();

        return ResponseEntity.ok(taskMapper.coreListToResponseDtoList(taskCoreList));
    }
}
