package org.ulpgc.is1.model;

public class Effort {
    private Employee employee;
    private Task task;
    private int amount;

    public Effort(Employee employee, Task task, int amount) {
        this.employee = employee;
        this.task = task;
        this.amount = amount;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Task getTask() {
        return task;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
