package com.learning.RepositoriesOrDao;

import com.learning.Models.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Employee> {
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setId(rs.getInt(1));
        employee.setName(rs.getString(2));
        employee.setSalary(rs.getDouble(3));
        return employee;
    }
}
