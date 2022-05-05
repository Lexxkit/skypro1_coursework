package com.lexxkit;

public class Main {

    public static void main(String[] args) {
//        Employee[] employees = new Employee[10];
//        Employee employee1 = new Employee("Test1", 10, "1");
//        Employee employee2 = new Employee("Test2", 5, "2");
//
//        employees[0] = employee1;
//        employees[1] = employee2;
//
//        System.out.println("Total monthly salary is " + getMonthlySalaryExpenses(employees) + " rubles.");
//        System.out.println("Employee with minimal salary is " + getEmployeeWithMinSalary(employees));
//        System.out.println("Employee with maximum salary is " + getEmployeeWithMaxSalary(employees));
//        System.out.println("Average monthly salary is " + getAverageMonthlySalary(employees) + " rubles.");
//        printEmployeesFullname(employees);

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
    }

//    public static void printInfoByDepartment(Employee[] employees, String department) {
//        Employee[] departmentEmployees = getEmployeesByDepartment(employees, department);
//
//        System.out.println("Information about employees at department # " + department);
//
//        System.out.println("Employee with minimal salary is " + getEmployeeWithMinSalary(departmentEmployees));
//        System.out.println("Employee with maximum salary is " + getEmployeeWithMaxSalary(departmentEmployees));
//        System.out.println("Total monthly salary is " + getMonthlySalaryExpenses(departmentEmployees) + " rubles.");
//        System.out.println("Average monthly salary is " + getAverageMonthlySalary(departmentEmployees) + " rubles.");
//        indexSalary(departmentEmployees, 100);
//
//        for (Employee employee : departmentEmployees) {
//            if (employee != null) {
//                System.out.println("Employee{" +
//                        "id=" + employee.getId() +
//                        ", fullName='" + employee.getFullName() + '\'' +
//                        ", salary=" + employee.getSalary() + " rubles" +
//                        '}');
//            }
//        }
//        printDelimiter();
//    }
//
//    private static Employee[] getEmployeesByDepartment(Employee[] employees, String department) {
//        Employee[] departmentEmployees = new Employee[employees.length];
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i] != null && employees[i].getDepartment().equals(department)) {
//                departmentEmployees[i] = employees[i];
//            }
//        }
//        return departmentEmployees;
//    }
//
//    public static Employee getMinimalSalaryByDepartment(Employee[] employees, String department) {
//        Employee[] departmentEmployees = getEmployeesByDepartment(employees, department);
//        return getEmployeeWithMinSalary(departmentEmployees);
//    }
//
//    public static Employee getMaximumSalaryByDepartment(Employee[] employees, String department) {
//        Employee[] departmentEmployees = getEmployeesByDepartment(employees, department);
//        return getEmployeeWithMaxSalary(departmentEmployees);
//    }

    public static void printDelimiter() {
        System.out.println("====================");
    }
}
