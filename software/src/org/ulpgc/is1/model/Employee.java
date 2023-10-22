package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String email;
    private List<Effort> tasksWithEfforts;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.tasksWithEfforts = new ArrayList<Effort>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addTaskWithEffort(Task task, int effort) {
        tasksWithEfforts.add(new Effort(this, task, effort));
    }
}
