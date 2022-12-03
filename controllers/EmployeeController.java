package controllers;

import common.exception.ExistException;
import common.exception.NotFoundInDatabase;
import models.person.Employee;
import services.IService;
import services.extend.impl.EmployeeServiceImpl;

import java.util.List;

public class EmployeeController {

    private final IService<Employee> service = new EmployeeServiceImpl();

    public List<Employee> displayEmployee() {
        return this.service.display();
    }

    public void addEmployee(Employee employee) {
        try {
            this.service.add(employee);
        } catch (ExistException e) {
            throw new RuntimeException(e);
        }
    }

    public void editEmployee(Employee employee) {
        this.service.edit(employee);
    }

    public void deleteEmployee(Employee employee) {
        try {
            this.service.delete(employee);
        } catch (NotFoundInDatabase e) {
            throw new RuntimeException(e);
        }
    }
}
