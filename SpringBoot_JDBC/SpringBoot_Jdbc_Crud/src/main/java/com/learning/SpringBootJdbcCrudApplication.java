package com.learning;

import com.learning.Models.Student;
import com.learning.Services.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootJdbcCrudApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(SpringBootJdbcCrudApplication.class, args);
		System.out.println("===================== Student Crud Application =====================");
		Student student = context.getBean(Student.class);
		StudentService service = context.getBean(StudentService.class);
		//Saving Students in Database
		/*
		student.setRollNo(76);
		student.setMarks(24);
		student.setName("Sandeep");
		boolean savedInDataBase = service.addStudent(student);
		System.out.println("Student added In Database : " + savedInDataBase);
		*/
		//Retrieving all Student records from the Database
		List<Student> studentList = service.getAllStudentRecords();
		//System.out.println(studentList);
		System.out.println("\nStudent Records : ");
		for(Student s : studentList) {
			System.out.println(s);
		}
		System.out.println("\n");

	}

}
