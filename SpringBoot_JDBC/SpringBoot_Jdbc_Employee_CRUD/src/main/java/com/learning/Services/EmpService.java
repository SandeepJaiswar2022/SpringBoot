package com.learning.Services;

import com.learning.Models.Employee;
import com.learning.RepositoriesOrDao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    private EmpDao empDao;

    public EmpDao getEmpDao() {
        return empDao;
    }
    @Autowired
    public void setEmpDao(EmpDao empDao) {
        this.empDao = empDao;
    }

    public boolean addEmployee(Employee emp) {
        return empDao.add(emp)==1;
    }

    public Employee getEmployeeById(int id) {
        return empDao.find(id);
    }

    public List<Employee> getAllEmployee() {
        return empDao.findAll();
    }

    public boolean updateEmployee(Employee emp) {
        return empDao.update(emp)==1;
    }

    public boolean deleteEmployee(int id) {
        return empDao.delete(id)==1;
    }

    public boolean isEligibleForHike(Employee emp) {
        return true;
    }
}
