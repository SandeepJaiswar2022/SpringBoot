package com.learning;

import com.learning.Models.Employee;
import com.learning.Services.EmpService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootJdbcEmployeeCrudApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(SpringBootJdbcEmployeeCrudApplication.class, args);
        System.out.println("----------------------- Employee CRUD Application started -----------------------");
        EmpService empService = context.getBean(EmpService.class);

        //Adding Student in Database.............
        /*
        Employee employee = context.getBean(Employee.class);
        employee.setName("Mark Wood");
        employee.setSalary(6000);

        boolean isAddedInDatabase = empService.addEmployee(employee);
        System.out.println("Employee added in database : " + isAddedInDatabase);
         */

        //Deleting Student from Database............
        /*
        boolean isDeletedFromDatabase = empService.deleteEmployee(4);
        System.out.println("Employee deleted from database : " + isDeletedFromDatabase);
         */

        //Updating Student in Database............
        /*
        Employee employee = context.getBean(Employee.class);
        employee.setSalary(9000);
        employee.setId(1);
        employee.setName("Sandeep");
        boolean isUpdatedInDatabase = empService.updateEmployee(employee);
        System.out.println("Employee updated in database : " + isUpdatedInDatabase);
         */

        //Retrieving a particular Student from database...........
        /*
        Employee employee = empService.getEmployeeById(1);
        System.out.println(employee);
         */

        //Retrieving all Students from database...........
        List<Employee> employeeList = empService.getAllEmployee();
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }

}
