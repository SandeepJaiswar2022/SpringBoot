package com.learning;

import com.learning.Model.Student;
import com.learning.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JdbcDemo2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JdbcDemo2Application.class, args);
//		Student student = context.getBean(Student.class);
//		student.setId(2);
//		student.setName("Sandeep");
//		student.setAge(22);
//		student.setSubject("history");
		//System.out.println(student);

		StudentService studentService = context.getBean(StudentService.class);

//		System.out.println("Saved in database or not : "+studentService.saveToDatabase(student));
//		System.out.println("Updated in database or not : "+studentService.updateToDatabase(student));
//		System.out.println("Deleted from DB : "+studentService.deleteFromDatabase(3));
//		System.out.println(studentService.findById(1));
		System.out.println(studentService.findAll());
	}

}
