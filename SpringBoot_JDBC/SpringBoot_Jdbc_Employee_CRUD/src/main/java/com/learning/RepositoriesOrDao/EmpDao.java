package com.learning.RepositoriesOrDao;

import com.learning.Models.Employee;
import com.mysql.cj.result.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int add(Employee emp) {
       String sql = "insert into employee(emp_name,emp_salary) values(?,?)";

        return jdbcTemplate.update(sql,emp.getName(),emp.getSalary());
    }

    public Employee find(int id) {
        String sql = "select * from employee where emp_id=?";
        RowMapper<Employee> rowMapper = new RowMapperImpl();
        return jdbcTemplate.queryForObject(sql,rowMapper,id);
    }

    public List<Employee> findAll() {
        String sql = "select * from employee";
        RowMapper<Employee> rowMapper = new RowMapperImpl();
        return jdbcTemplate.query(sql,rowMapper);
    }

    public int update(Employee emp) {
        String sql = "update employee set emp_name=?,emp_salary=? where emp_id=?;";
        return jdbcTemplate.update(sql,emp.getName(),emp.getSalary(),emp.getId());
    }

    public int delete(int id) {
        String sql = "delete from employee where emp_id=?";
     return jdbcTemplate.update(sql,id);
    }
}
