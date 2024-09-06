package com.learning.Repositories;

import com.learning.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
@Scope("prototype")
public class StudentRepository {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(Student student) {
        String sql = "INSERT INTO student (rollNumber, studentName, studentAge) VALUES (?, ?, ?)";

        return jdbcTemplate.update(sql,student.getRollNo(),student.getName(),student.getMarks());
    }

    public List<Student> findAll() {
        String sql = "SELECT * FROM student";

        //1st way

//        RowMapper<Student> studentRowMapper = new RowMapper<Student>() {
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student student = new Student();
//                student.setRollNo(rs.getInt("rollNumber"));
//                student.setName(rs.getString("studentName"));
//                student.setMarks(rs.getInt("studentAge"));
//                return student;
//            }
//        };

//        return jdbcTemplate.query(sql,studentRowMapper);

        //2nd way Lambda expression
//        RowMapper<Student> studentRowMapper = (rs, rowNum) -> {
//                Student student = new Student();
//                student.setRollNo(rs.getInt("rollNumber"));
//                student.setName(rs.getString("studentName"));
//                student.setMarks(rs.getInt("studentAge"));
//                return student;
//            };
//        return jdbcTemplate.query(sql,studentRowMapper);

        //3rd way Lambda expression using as an argument

        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Student student = new Student();
            student.setRollNo(rs.getInt("rollNumber"));
            student.setName(rs.getString("studentName"));
            student.setMarks(rs.getInt("studentAge"));
            return student;
        });
    }
}
