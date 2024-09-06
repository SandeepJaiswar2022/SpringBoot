package com.learning.Service;

import com.learning.Model.Student;
import com.learning.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public Student saveToDatabase(Student student) {
      return studentRepo.save(student);
    }
    public void deleteAllFromDatabase() {
        studentRepo.deleteAll();
        System.out.println("Deleted all students");
    }

    public Student updateToDatabase(Student student3) {
        return studentRepo.save(student3);
    }

    public Student findStudentById(int std_id) {
        Optional<Student> student = studentRepo.findById(std_id);
        return student.orElse(new Student());
    }

    public List<Student> findAllFromDatabase() {
        return studentRepo.findAll();
    }

    public void deleteByIdFromDatabase(int student_id) {
        studentRepo.deleteById(student_id);
        System.out.println("Deleted student with id: " + student_id);
    }

    public List<Student> findStudentByName(String student_name) {
        return studentRepo.findByName(student_name);
    }
}
