package services.extend.impl;

import common.exception.ExistException;
import common.exception.NotFoundException;
import common.exception.NotFoundInDatabase;
import models.Booking;
import models.person.Employee;
import models.person.Person;
import services.extend.IEmployeeService;
import services.impl.EmployeeIOService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeServiceImpl implements IEmployeeService {

    private final EmployeeIOService employeeIOService = new EmployeeIOService();

    private final String PATH_FILE_EMPLOYEE = "src/data/employee.csv";

//    private static final List<Employee> employeeList = new ArrayList<>();

//    static {
//        Employee employee = new Employee("Hoang", "30/04/1996", "Nam", 123456,
//                12345, "hoang@gmail.com", "NV-01", "Tien Sy", "CEO", 10000000);
//        employeeList.add(employee);
//    }

    @Override
    public List<Employee> getList() throws IOException {
        return this.employeeIOService.readFile(PATH_FILE_EMPLOYEE);
    }

    @Override
    public void add(Employee employee) throws ExistException, IOException {
        List<Employee> employeeList = this.employeeIOService.readFile(PATH_FILE_EMPLOYEE);
        for (Employee emp : employeeList) {
            if (Objects.equals(emp.getEmployeeCode(), employee.getEmployeeCode())) {
                throw new ExistException();
            }
        }

        employeeList.add(employee);
        this.employeeIOService.writeFile(PATH_FILE_EMPLOYEE, employeeList);
    }

    @Override
    public void edit(Employee employee) throws IOException, ExistException {
        List<Employee> employeeList = this.employeeIOService.readFile(PATH_FILE_EMPLOYEE);
        for (Employee emp : employeeList) {
            if (Objects.equals(emp.getEmployeeCode(), employee.getEmployeeCode())) {
                throw new ExistException();
            }
        }
        for (Employee emp : employeeList) {
            if (Objects.equals(emp.getEmployeeCode(), employee.getEmployeeCode())) {
                emp.setName(employee.getName());
                emp.setBirthday(employee.getBirthday());
                emp.setGender(employee.getGender());
                emp.setIdCard(employee.getIdCard());
                emp.setPhoneNumber(employee.getPhoneNumber());
                emp.setEmail(employee.getEmail());
                emp.setLiteracy(employee.getLiteracy());
                emp.setPosition(employee.getPosition());
                emp.setSalary(employee.getSalary());
                break;
            } else {
                System.err.println("Invalid employee code, try again");
                break;
            }
        }

        this.employeeIOService.writeFile(PATH_FILE_EMPLOYEE, employeeList);
    }

    @Override
    public void delete(Employee object) throws IOException, NotFoundException {
        List<Employee> employeeList = this.employeeIOService.readFile(PATH_FILE_EMPLOYEE);
        Employee deleteEmployee = null;
        for (Employee emp : employeeList) {
            if (Objects.equals(emp.getEmployeeCode(), object.getEmployeeCode())) {
                deleteEmployee = emp;
                break;
            }
        }

        if (deleteEmployee == null) {
            throw new NotFoundException("Employee not exist, pls try input again to delete");
        }else {
            employeeList.remove(deleteEmployee);
            this.employeeIOService.writeFile(PATH_FILE_EMPLOYEE, employeeList);
        }
    }

    @Override
    public boolean checkId(String empCode) throws IOException {
        List<Employee> employeeList = this.employeeIOService.readFile(PATH_FILE_EMPLOYEE);
        for (Employee emp : employeeList) {
            if (empCode.equals(emp.getEmployeeCode())){
                return true;
            }
        }
        return false;
    }
}
