package com.learning;

import com.learning.Model.Student;
import com.learning.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SbJpaHibernateDemo1Application {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(SbJpaHibernateDemo1Application.class, args);
        StudentService studentService = context.getBean(StudentService.class);
//        Student student1 = context.getBean(Student.class);
//        student1.setAge(21);
//        student1.setName("John Doe");
//        student1.setSubject("History");
//        Student student2 = context.getBean(Student.class);
//        student2.setAge(22);
//        student2.setName("Jane Nae");
//        student2.setSubject("Geography");
        Student student3 = context.getBean(Student.class);
        student3.setAge(24);
        student3.setName("Sandeep");
        student3.setSubject("Maths");

        //Inserting Data into DB............
//        System.out.println(studentService.saveToDatabase(student1));
//        System.out.println(studentService.saveToDatabase(student2));
//        System.out.println(studentService.saveToDatabase(student3));

        //Deleting all records from the DB............
//      studentService.deleteAllFromDatabase();

        //Find Student by id from DB............
//     System.out.println(studentService.findStudentById(6));

        //Updating a record in database............
//     Student student4 = studentService.findStudentById(6);
//     student4.setAge(25);
//     student4.setSubject("English");
//     System.out.println(studentService.updateToDatabase(student4));

        //Find all Student from DB............
//     System.out.println(studentService.findAllFromDatabase());

        //Deleting particular record from DB............
//       studentService.deleteByIdFromDatabase(9);

        //Find Student by name or any other attribute............
//     System.out.println(studentService.findStudentByName("Sandeep"));
     
    }
}
