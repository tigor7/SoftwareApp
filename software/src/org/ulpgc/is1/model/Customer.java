package org.ulpgc.is1.model;

public class Customer {
    private String name;
    private String surname;
    private Phone phone;

    public Customer(String name, String surname, Phone phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }
}
