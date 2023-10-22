package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private static int NEXT_ID = 0;
    private final int id;
    private String name;
    private String description;
    private ProjectType type;
    private List<Task> tasks;
    private Employee manager;
    private Customer customer;
    private List<Employee> developers;
    private final List<Contract> contractList;

    public Project(String name, String description, ProjectType type, Customer customer, Employee manager) {
        this.id = NEXT_ID++;
        this.name = name;
        this.description = description;
        this.type = type;
        tasks = new ArrayList<Task>();
        this.manager = manager;
        this.customer = customer;
        this.customer.addProject(this);
        developers = new ArrayList<Employee>();
        contractList = new ArrayList<Contract>();
    }

    public int getId() {
        return id;
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

    public ProjectType getType() {
        return type;
    }

    public void setType(ProjectType type) {
        this.type = type;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void addTask(String name, String description, TaskType type, Date start, Date end) {
        tasks.add(new Task(name, description, type, start, end));
    }

    public void addDeveloper(Employee developer) {
        developers.add(developer);
    }

    public void asignTaskWithEffort(Employee employee, Task task, int effort) {
        employee.addTaskWithEffort(task, effort);
    }

    public List<Task> getTasks() {
        return tasks;
    }

}
