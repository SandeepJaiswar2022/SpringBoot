package com.learning.Repo;

import com.learning.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepo {

    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean save(Student student) {
        String sql = "insert into student(student_name,student_age,student_subject) values(?,?,?)";
       return jdbcTemplate.update(sql,student.getName(),student.getAge(),student.getSubject())>0;
    }

    public boolean update(Student student) {
        String sql = "update student set student_name=?,student_age=?,student_subject=? where student_id=?";
        return jdbcTemplate.update(sql,student.getName(),student.getAge(),student.getSubject(),student.getId())>0;
    }

    public boolean delete(int studentId) {
        String sql = "delete from student where student_id=?";
        return jdbcTemplate.update(sql,studentId)>0;
    }

    public Student findById(int studentId) {
        String sql = "select * from student where student_id=?";
        RowMapper<Student> rowMapper = new RowMapperImplnt();
        return jdbcTemplate.queryForObject(sql,rowMapper,studentId);
    }

    public List<Student> findAll() {
        String sql = "select * from student";
        RowMapper<Student> rowMapper = new RowMapperImplnt();
        return jdbcTemplate.query(sql,rowMapper);
    }
}
