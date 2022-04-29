package com.lexxkit;

public class Employee {
    int id;
    String fullName;
    double salary;
    int department;

    public Employee(String fullName, double salary, int department) {
        this.id = Main.getIdCounter();
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
}
