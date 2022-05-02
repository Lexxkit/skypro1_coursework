package com.lexxkit;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Employee employee1 = new Employee("Test1", 10, "1");
        Employee employee2 = new Employee("Test2", 5, "2");

        employees[0] = employee1;
        employees[1] = employee2;

        printEmployees(employees);
        System.out.println("Total monthly salary is " + getMonthlySalaryExpenses(employees) + " rubles.");
        System.out.println("Employee with minimal salary is " + getEmployeeWithMinSalary(employees));
        System.out.println("Employee with maximum salary is " + getEmployeeWithMaxSalary(employees));
        System.out.println("Average monthly salary is " + getAverageMonthlySalary(employees) + " rubles.");
        printEmployeesFullname(employees);

    }

    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
        printDelimiter();
    }

    public static double getMonthlySalaryExpenses(Employee[] employees) {
        double salarySum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                salarySum += employee.getSalary();
            }
        }
        return salarySum;
    }

    public static Employee getEmployeeWithMinSalary(Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee getEmployeeWithMaxSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }

    public static double getAverageMonthlySalary(Employee[] employees) {
        int employeeCounter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                employeeCounter += 1;
            }
        }
        return getMonthlySalaryExpenses(employees) / employeeCounter;
    }

    public static void printEmployeesFullname(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());

            }
        }
        printDelimiter();
    }

    public static void printDelimiter() {
        System.out.println("====================");
    }
}
