package org.ulpgc.is1.model;

import java.time.LocalDateTime;

public class Task {
    private String name;
    private String description;
    private LocalDateTime start;
    private LocalDateTime end;
    private TaskType type;

    public Task(String name, String description, TaskType type, LocalDateTime start, LocalDateTime end) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }
}
