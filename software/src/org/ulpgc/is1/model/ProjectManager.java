package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager {
    private List<Customer> customers;
    private List<Employee> employees;

    public ProjectManager() {
        this.customers = new ArrayList<Customer>();
        this.employees = new ArrayList<Employee>();

    }

    public void addCustomer(String name, String surname, Phone phone) {
        customers.add(new Customer(name, surname, phone));
    }

    public void addEmployee(String name, String email) {
        employees.add(new Employee(name, email));
    }

    public Customer getCustomer(int index) {
        return customers.get(index);
    }

    public Employee getEmployee(int index) {
        return employees.get(index);
    }

    public void removeCustomer(int index) {
        customers.remove(index);
    }

    public void removeEmployee(int index) {
        employees.remove(index);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
