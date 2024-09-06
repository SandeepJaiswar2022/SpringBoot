package com.learning.Service;

import com.learning.Model.Student;
import com.learning.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    StudentRepo studentRepo;

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public boolean saveToDatabase(Student student) {
        return studentRepo.save(student);
    }

    public boolean updateToDatabase(Student student) {
        return studentRepo.update(student);
    }

    public boolean deleteFromDatabase(int student_id) {
        return studentRepo.delete(student_id);
    }

    public Student findById(int student_id) {
        return studentRepo.findById(student_id);
    }

    public List<Student> findAll() {
        return studentRepo.findAll();
    }
}
