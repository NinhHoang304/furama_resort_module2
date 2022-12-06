package services.impl;

import models.person.Employee;
import services.IFileListService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeIOService implements IFileListService<Employee> {

    @Override
    public List<Employee> readFile(String pathFile) throws IOException {
        FileReader fileReader = new FileReader(pathFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        List<Employee> employeeList = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null){
            String[] ele = line.split(",");
            Employee employee = new Employee(ele[0], ele[1], ele[2], Integer.parseInt(ele[3]), Integer.parseInt(ele[4]),
                    ele[5], ele[6], ele[7], ele[8], Double.parseDouble(ele[9]));
            employeeList.add(employee);
        }
        bufferedReader.close();
        fileReader.close();
        return employeeList;
    }

    @Override
    public void writeFile(String pathFile, List<Employee> employees) throws IOException {
        FileWriter fileWriter = new FileWriter(pathFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Employee employee : employees) {
            bufferedWriter.write(employee.formatCSVFileEmployee());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
