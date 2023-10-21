package org.ulpgc.is1.control;

import org.ulpgc.is1.model.Phone;
import org.ulpgc.is1.model.ProjectManager;

public class Main {
    private static void init(ProjectManager manager) {
        // i create two clients
        manager.addCustomer("John", "Doe", new Phone("123456789"));
        manager.addCustomer("Mary", "Jane", new Phone("987654321"));

        // ii create two employees
        manager.addEmployee("Jack", "jack@example.com");
        manager.addEmployee("Joe", "joe@example.com");

    }
    public static void main(String[] args) {
        ProjectManager manager = new ProjectManager();
        init(manager);
        System.out.print("Hello and welcome! :DD");
        System.out.print("Hello");

    }
}
