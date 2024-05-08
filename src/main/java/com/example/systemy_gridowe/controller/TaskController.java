package com.example.systemy_gridowe.controller;

import com.example.systemy_gridowe.model.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/task")
public class TaskController {
    @PostMapping("/create")
    public ResponseEntity<String> createTask(@RequestBody Task task){
        System.out.println("JEST");
        return ResponseEntity.ok("Jest ok");
    }
}
