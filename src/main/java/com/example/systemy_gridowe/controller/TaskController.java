package com.example.systemy_gridowe.controller;

import com.example.systemy_gridowe.model.Task;
import com.example.systemy_gridowe.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("task")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("create")
    public ResponseEntity<String> createTask(@RequestBody Task task){
        taskService.saveTask(task);
        System.out.println("SAVED");
        return ResponseEntity.ok("Jest ok123");
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        System.out.println("JEST1");
        return ResponseEntity.ok("HELLO1");
    }
}
