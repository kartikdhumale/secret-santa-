package org.example.model;

public class Assignment {
    private Employee giver;
    private Employee receiver;

    public Assignment(Employee giver, Employee receiver) {
        this.giver = giver;
        this.receiver = receiver;
    }

    public Employee getGiver() { return giver; }
    public Employee getReceiver() { return receiver; }
}