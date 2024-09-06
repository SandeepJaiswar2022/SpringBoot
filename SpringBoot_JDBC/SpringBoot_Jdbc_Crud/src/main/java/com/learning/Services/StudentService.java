package com.learning.Services;

import com.learning.Models.Student;
import com.learning.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope("prototype")
public class StudentService {
    private StudentRepository studentRepository;

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public boolean addStudent(Student student) {
        int rowsAffected = studentRepository.save(student);
        return rowsAffected == 1;
    }

    public List<Student> getAllStudentRecords() {
        return studentRepository.findAll();
    }
}
