package controllers;

import common.exception.ExistException;
import common.exception.NotFoundException;
import common.exception.NotFoundInDatabase;
import models.person.Employee;
import services.extend.IEmployeeService;
import services.extend.impl.EmployeeServiceImpl;

import java.io.IOException;
import java.util.List;

public class EmployeeController {

    private final IEmployeeService employeeService = new EmployeeServiceImpl();

    public List<Employee> displayEmployee() {
        try {
            return this.employeeService.getList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addEmployee(Employee employee) {
        try {
            this.employeeService.add(employee);
        } catch (ExistException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void editEmployee(Employee employee) {
        try {
            this.employeeService.edit(employee);
        } catch (IOException | ExistException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteEmployee(Employee employee) {
        try {
            try {
                this.employeeService.delete(employee);
            } catch (IOException | NotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (NotFoundInDatabase e) {
            throw new RuntimeException(e);
        }
    }
}
