package controllers;

import common.exception.ExistException;
import common.exception.NotFoundInDatabase;
import models.person.Employee;
import services.extend.IEmployeeService;
import services.extend.impl.EmployeeServiceImpl;

import java.io.IOException;
import java.util.List;

public class EmployeeController {

    private final IEmployeeService employeeService = new EmployeeServiceImpl();

    public List<Employee> displayEmployee() {
        return this.employeeService.getList();
    }

    public void addEmployee(Employee employee) {
        try {
            this.employeeService.add(employee);
        } catch (ExistException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void editEmployee(Employee employee) {
        this.employeeService.edit(employee);
    }

    public void deleteEmployee(Employee employee) {
        try {
            this.employeeService.delete(employee);
        } catch (NotFoundInDatabase e) {
            throw new RuntimeException(e);
        }
    }
}
