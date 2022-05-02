package com.lexxkit;

import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook(int size) {
        this.employees = new Employee[size];
    }

    public void addEmployee(String fullName, double salary, String department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee newEmployee = new Employee(fullName, salary, department);
                employees[i] = newEmployee;
                System.out.println("New " + newEmployee + " was added.");
                return;
            }
        }
        System.out.println("Your Employee Book is full! You cannot add new employees.");
    }

    public Employee getEmployeeByName(String employeeName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(employeeName)) {
                return employees[i];
            }
        }
        return null;
    }

    public void changeEmployeeSalary(String employeeName, double newSalary) {
        Employee employee = getEmployeeByName(employeeName);
        if (employee == null) {
            System.out.println("Employee '" + employeeName + "' was not found in Employee Book!");
        } else {
            employee.setSalary(newSalary);
        }
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                System.out.println(employees[i] + " was deleted.");
                employees[i] = null;
                return;
            }
        }
        System.out.println("Employee with ID '" + id + "' was not found in Employee Book!");
    }

    public void deleteEmployee(String employeeName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(employeeName)) {
                System.out.println(employees[i] + " was deleted.");
                employees[i] = null;
                return;
            }
        }
        System.out.println("Employee '" + employeeName + "' was not found in Employee Book!");
    }

    public void deleteEmployee(int id, String employeeName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(employeeName) && employees[i].getId() == id) {
                System.out.println(employees[i] + " was deleted.");
                employees[i] = null;
                return;
            }
        }
        System.out.println("Employee with ID '" + id + "' " +
                employeeName + "' was not found in Employee Book!");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employees) {
            if (employee != null) {
                sb.append(employee);
                sb.append("\n");
            }
        }
        if (sb.length() > 0) {
            sb.insert(0, "List of employees:\n");
        } else {
            sb.append("Employee Book is empty!");
        }
        return sb.toString().trim();
    }
}
