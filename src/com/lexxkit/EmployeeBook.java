package com.lexxkit;

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

    private Employee[] getEmployeesByDepartment(String department) {
        Employee[] departmentEmployees = new Employee[employees.length];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment().equals(department)) {
                departmentEmployees[i] = employees[i];
            }
        }
        return departmentEmployees;
    }

    public Employee getEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }

    public Employee getEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }

    public Employee getEmployeeWithMinSalaryByDepartment(String department) {
        Employee[] departmentEmployees = getEmployeesByDepartment(department);
        Employee employeeWithMinSalary = departmentEmployees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }

    public Employee getEmployeeWithMaxSalaryByDepartment(String department) {
        Employee[] departmentEmployees = getEmployeesByDepartment(department);
        Employee employeeWithMaxSalary = departmentEmployees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }

    public double getTotalMonthlySalaryExpenses() {
        double salarySum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                salarySum += employee.getSalary();
            }
        }
        return salarySum;
    }

    public double getMonthlySalaryExpensesByDepartment(String department) {
        double salarySum = 0;
        Employee[] departmentEmployees = getEmployeesByDepartment(department);
        for (Employee employee : departmentEmployees) {
            if (employee != null) {
                salarySum += employee.getSalary();
            }
        }
        return salarySum;
    }

    public  double getTotalAverageMonthlySalary() {
        int employeeCounter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                employeeCounter += 1;
            }
        }
        return getTotalMonthlySalaryExpenses() / employeeCounter;
    }

    public  double getAverageMonthlySalaryByDepartment(String department) {
        int employeeCounter = 0;
        Employee[] departmentEmployees = getEmployeesByDepartment(department);
        for (Employee employee : departmentEmployees) {
            if (employee != null) {
                employeeCounter += 1;
            }
        }
        return getTotalMonthlySalaryExpenses() / employeeCounter;
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

    public void printAllEmployeesFullname() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public void indexSalary(int indexPercentage) {
        double index = indexPercentage / 100.0;
        for (Employee employee : employees) {
            if (employee != null) {
                double currentSalary = employee.getSalary();
                double newSalary = currentSalary + currentSalary * index;
                employee.setSalary(newSalary);
            }
        }
    }

    public void indexSalaryByDepartment(String department, int indexPercentage) {
        double index = indexPercentage / 100.0;
        Employee[] departmentEmployees = getEmployeesByDepartment(department);
        for (Employee employee : departmentEmployees) {
            if (employee != null) {
                double currentSalary = employee.getSalary();
                double newSalary = currentSalary + currentSalary * index;
                employee.setSalary(newSalary);
            }
        }
    }


    public void printAllEmployees() {
        System.out.println(this);
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
