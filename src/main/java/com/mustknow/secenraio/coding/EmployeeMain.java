package com.mustknow.secenraio.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeMain {

    /**
     * Finds and prints employees who earn more than their direct managers
     * using traditional for-loops.
     */
    public static void main(String[] args) {
        List<Employee> employees = getEmployeeList();

        // A list to store the employees who meet the criteria.
        List<Employee> highEarningEmployees = new ArrayList<>();

        System.out.println("Employees earning more than their managers:");

        // 1. Outer loop: Iterate through each employee to check them.
        for (Employee employee : employees) {
            // We can only check employees who actually have a manager.
            if (employee.getManagerId() != null) {
                // 2. Inner loop: Find the manager for the current employee.
                for (Employee manager : employees) {
                    // Check if this 'manager' object is the manager of the current 'employee'.
                    if (employee.getManagerId().equals(manager.getId())) {
                        // 3. Compare their salaries.
                        if (employee.getSalary() > manager.getSalary()) {
                            // If the employee earns more, add them to our results list.
                            highEarningEmployees.add(employee);
                        }
                        // Since we found the manager, we can stop searching for this employee.
                        break;
                    }
                }
            }
        }

        // Print all the employees we found.
        for (Employee employee : highEarningEmployees) {
            System.out.println(employee);
        }
    }

    private static List<Employee> getEmployeeList() {
        return Arrays.asList(
                new Employee(1L, 80000, null),    // CEO, no manager
                new Employee(2L, 60000, 1L),     // Manager reporting to CEO
                new Employee(3L, 65000, 1L),     // Another Manager reporting to CEO
                new Employee(4L, 70000, 2L),     // Earns MORE than manager (ID 2)
                new Employee(5L, 50000, 2L),     // Earns LESS than manager (ID 2)
                new Employee(6L, 55000, 3L),     // Earns LESS than manager (ID 3)
                new Employee(7L, 75000, 3L)      // Earns MORE than manager (ID 3)
        );
    }
}