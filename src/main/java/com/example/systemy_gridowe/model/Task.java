package com.example.systemy_gridowe.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "title")
    private String title;

    @Column(nullable = false, name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private TaskStatus status;

    @Column(name = "priority")
    private Integer priority;

    @Column(name = "due")
    private LocalDateTime due;

    @Column(name = "create_date", updatable = false)
    private LocalDateTime createDate;

    public Task(Long id, String title, String description, TaskStatus status, Integer priority, LocalDateTime due) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.due = due;
    }

    @PrePersist
    protected void onCreate() {
        createDate = LocalDateTime.now();
    }
}
