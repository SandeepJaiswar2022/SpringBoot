package com.learning.Repo;

import com.learning.Model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImplnt implements RowMapper<Student> {
public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
    Student student = new Student();
    student.setId(rs.getInt(1));
    student.setName(rs.getString(2));
    student.setAge(rs.getInt(3));
    student.setSubject(rs.getString(4));
    return student;
}
}
