package services.impl;

import models.person.Customer;
import models.person.Employee;
import services.IFileListService;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomerIOService implements IFileListService<Customer> {

    @Override
    public List<Customer> readFile(String pathFile) throws IOException {
        FileReader fileReader = new FileReader(pathFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        List<Customer> customerList = new LinkedList<>();
        while ((line = bufferedReader.readLine()) != null){
            String[] ele = line.split(",");
            Customer customer = new Customer(ele[0], ele[1], ele[2], Integer.parseInt(ele[3]), Integer.parseInt(ele[4]),
                    ele[5], ele[6], ele[7], ele[8]);
            customerList.add(customer);
        }
        bufferedReader.close();
        fileReader.close();
        return customerList;
    }

    @Override
    public void writeFile(String pathFile, List<Customer> customers) throws IOException {
        FileWriter fileWriter = new FileWriter(pathFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Customer customer : customers) {
            bufferedWriter.write(customer.formatCSVFileCustomer());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
