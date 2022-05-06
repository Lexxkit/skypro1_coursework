package com.lexxkit;

public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook(2);
        System.out.println(employeeBook);
        printDelimiter();

        employeeBook.addEmployee("Test3", 10, "1");
        employeeBook.addEmployee("Test4", 12, "2");
        employeeBook.addEmployee("Test5", 200, "5");

        employeeBook.printAllEmployees();
        printDelimiter();

        employeeBook.deleteEmployee("Test5");
        employeeBook.deleteEmployee("Test4");
        employeeBook.printAllEmployees();
        printDelimiter();
        employeeBook.deleteEmployee(0);
        printDelimiter();
        employeeBook.addEmployee("Test6", 50, "3");
        employeeBook.changeEmployeeSalary("Test3", 30);
        employeeBook.printAllEmployees();
        printDelimiter();
        employeeBook.changeEmployeeSalary("test", 0);
        printDelimiter();
        System.out.println("Total monthly salary is " + employeeBook.getTotalMonthlySalaryExpenses() + " rubles.");
        System.out.println("Employee with minimal salary is " + employeeBook.getEmployeeWithMinSalary());
        System.out.println("Employee with maximum salary is " + employeeBook.getEmployeeWithMaxSalary());
        System.out.println("Average monthly salary is " + employeeBook.getTotalAverageMonthlySalary() + " rubles.");

        printDelimiter();
        employeeBook.printAllEmployeesFullname();

        printDelimiter();
        employeeBook.indexSalary(10);
        employeeBook.printAllEmployees();

        printDelimiter();
        employeeBook.printEmployeesForDepartment("1");

        printDelimiter();
        System.out.println(employeeBook.getMonthlySalaryExpensesByDepartment("1"));

        printDelimiter();
        employeeBook.printEmployeesWithSalaryLessThan(40);
        employeeBook.printEmployeesWithSalaryLessThan(20);

        printDelimiter();
        employeeBook.printEmployeesWithSalaryGraterOrEqualThan(20);
        employeeBook.printEmployeesWithSalaryGraterOrEqualThan(100);

        printDelimiter();
        employeeBook.printAllEmployeesByDepartment();
    }

    public static void printDelimiter() {
        System.out.println("====================");
    }
}
