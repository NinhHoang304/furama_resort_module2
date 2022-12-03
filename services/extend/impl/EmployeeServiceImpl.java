package services.extend.impl;

import common.exception.ExistException;
import common.exception.NotFoundInDatabase;
import models.person.Employee;
import models.person.Person;
import services.extend.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeServiceImpl implements IEmployeeService {

    private static final List<Employee> employeeList;

    static {
        employeeList = new ArrayList<>();
    }

    @Override
    public List<Employee> display() {
        return EmployeeServiceImpl.employeeList;
    }

    @Override
    public void add(Employee object) throws ExistException {
        for (Employee emp : employeeList) {
            if (Objects.equals(emp.getEmployeeCode(), object.getEmployeeCode())) {
                throw new ExistException();
            }
        }
        employeeList.add(object);
    }

    @Override
    public void edit(Employee object) {
        for (Employee emp : employeeList) {
            if (Objects.equals(emp.getEmployeeCode(), object.getEmployeeCode())) {
                emp.setName(object.getName());
                emp.setBirthday(object.getBirthday());
                emp.setGender(object.getGender());
                emp.setIdCard(object.getIdCard());
                emp.setPhoneNumber(object.getPhoneNumber());
                emp.setEmail(object.getEmail());
                emp.setLiteracy(object.getLiteracy());
                emp.setPosition(object.getPosition());
                emp.setSalary(object.getSalary());
                break;
            }
        }
    }

    @Override
    public void delete(Employee object) throws NotFoundInDatabase {
        Employee deleteEmployee = null;
        for (Employee emp : employeeList) {
            if (Objects.equals(emp.getEmployeeCode(), object.getEmployeeCode())) {
                deleteEmployee = emp;
                break;
            }
        }

        if (deleteEmployee == null) {
            throw new NotFoundInDatabase();
        }

        employeeList.remove(deleteEmployee);
    }
}
