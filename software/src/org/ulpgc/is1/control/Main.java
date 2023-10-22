package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.util.Date;

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
        project.addTask("Task1", "Some task", TaskType.Programming, new Date(), new Date());
        project.addTask("Test1", "Test task1", TaskType.Test, new Date(), new Date());
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

        // vii

        // viii

        // ix remove second client
        System.out.println("The number of clients is " + manager.getCustomers().size());
        
        manager.removeCustomer(1);

        // x
        System.out.println("The number of clients is " + manager.getCustomers().size());
    }
}
