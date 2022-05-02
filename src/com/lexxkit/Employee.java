package com.lexxkit;

public class Employee {
    private static int idCounter = 1;

    private int id;
    private String fullName;
    private double salary;
    private String department;

    public Employee(String fullName, double salary, String department) {
        this.id = idCounter++;
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

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary + " rubles" +
                ", department=" + department +
                '}';
    }
}
