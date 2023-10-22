package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String surname;
    private Phone phone;
    private List<Project> projects;

    public Customer(String name, String surname, Phone phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        projects = new ArrayList<Project>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone.getNumber();
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public Project getProject(int index) {
        return projects.get(index);
    }
}
