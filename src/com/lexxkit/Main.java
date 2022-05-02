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

        EmployeeBook employeeBook = new EmployeeBook(2);
        System.out.println(employeeBook);
        printDelimiter();

        employeeBook.addEmployee("Test3", 10, "1");
        employeeBook.addEmployee("Test4", 12, "2");
        employeeBook.addEmployee("Test5", 200, "5");

        System.out.println(employeeBook);
        printDelimiter();

        employeeBook.deleteEmployee("Test5");
        employeeBook.deleteEmployee("Test4");
        System.out.println(employeeBook);
        printDelimiter();
        employeeBook.deleteEmployee(0);
        printDelimiter();
        employeeBook.addEmployee("Test6", 50, "3");
        employeeBook.changeEmployeeSalary("Test3", 30);
        System.out.println(employeeBook);
        employeeBook.changeEmployeeSalary("test", 0);


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

    public static void indexSalary(Employee[] employees, int indexPercentage) {
        double index = indexPercentage / 100.0;
        for (Employee employee : employees) {
            if (employee != null) {
                double currentSalary = employee.getSalary();
                double newSalary = currentSalary + currentSalary * index;
                employee.setSalary(newSalary);
            }
        }
    }

    public static void printInfoByDepartment(Employee[] employees, String department) {
        Employee[] departmentEmployees = getEmployeesByDepartment(employees, department);

        System.out.println("Information about employees at department # " + department);

        System.out.println("Employee with minimal salary is " + getEmployeeWithMinSalary(departmentEmployees));
        System.out.println("Employee with maximum salary is " + getEmployeeWithMaxSalary(departmentEmployees));
        System.out.println("Total monthly salary is " + getMonthlySalaryExpenses(departmentEmployees) + " rubles.");
        System.out.println("Average monthly salary is " + getAverageMonthlySalary(departmentEmployees) + " rubles.");
        indexSalary(departmentEmployees, 100);

        for (Employee employee : departmentEmployees) {
            if (employee != null) {
                System.out.println("Employee{" +
                        "id=" + employee.getId() +
                        ", fullName='" + employee.getFullName() + '\'' +
                        ", salary=" + employee.getSalary() + " rubles" +
                        '}');
            }
        }
        printDelimiter();
    }

    private static Employee[] getEmployeesByDepartment(Employee[] employees, String department) {
        Employee[] departmentEmployees = new Employee[employees.length];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment().equals(department)) {
                departmentEmployees[i] = employees[i];
            }
        }
        return departmentEmployees;
    }

    public static Employee getMinimalSalaryByDepartment(Employee[] employees, String department) {
        Employee[] departmentEmployees = getEmployeesByDepartment(employees, department);
        return getEmployeeWithMinSalary(departmentEmployees);
    }

    public static Employee getMaximumSalaryByDepartment(Employee[] employees, String department) {
        Employee[] departmentEmployees = getEmployeesByDepartment(employees, department);
        return getEmployeeWithMaxSalary(departmentEmployees);
    }

    public static void printDelimiter() {
        System.out.println("====================");
    }
}
