package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Main {
    private static void init(ProjectManager manager) {
        // i create two clients
        manager.addCustomer("John", "Doe", new Phone("123456789"));
        manager.addCustomer("Mary", "Jane", new Phone("987654321"));

        // ii create two employees
        manager.addEmployee("Jack", "jack@example.com");
        manager.addEmployee("Joe", "joe@example.com");

        // iii create project
        Project project = new Project("Project1", "Some project", ProjectType.Web_development, manager.getCustomer(0), manager.getEmployee(1));
        project.addDeveloper(manager.getEmployee(0));

        // iv create two task
        project.addTask("Task1", "Some task", TaskType.Programming, LocalDateTime.now(), LocalDateTime.now());
        project.addTask("Test1", "Test task1", TaskType.Test, LocalDateTime.now(), LocalDateTime.now());
    }
    public static void main(String[] args) {
        ProjectManager manager = new ProjectManager();
        init(manager);
        // v print first client data
        System.out.println("First client name is " + manager.getCustomer(0).getName());
        System.out.println("First client surname is " + manager.getCustomer(0).getSurname());
        System.out.println("First client phone is " + manager.getCustomer(0).getPhone());

        // vi print second employee data
        System.out.println("Second employee name is " + manager.getEmployee(1).getName());
        System.out.println("Second employee surname is " + manager.getEmployee(1).getEmail());

        // vii print first client project data
        System.out.println("First client project id is " + manager.getCustomer(0).getProject(0).getId());
        System.out.println("First client project name is " + manager.getCustomer(0).getProject(0).getName());
        System.out.println("First client project description is " + manager.getCustomer(0).getProject(0).getDescription());

        // viii print first client project tasks data
        List<Task> tasks =  manager.getCustomer(0).getProject(0).getTasks();
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Task "+ i + " name is " + tasks.get(i).getName());
            System.out.println("Task "+ i + " description is " + tasks.get(i).getDescription());
            System.out.println("Task "+ i + " start date" + tasks.get(i).getStart());
            System.out.println("Task "+ i + " end date" + tasks.get(i).getEnd());
        }

        // ix remove second client
        System.out.println("The number of clients is " + manager.getCustomers().size());
        manager.removeCustomer(1);
        System.out.println("Client removed");

        // x
        System.out.println("The number of clients is " + manager.getCustomers().size());
    }
}
