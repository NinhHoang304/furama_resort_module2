package views;

import controllers.EmployeeController;
import models.person.Employee;
import models.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuramaView {
    private final EmployeeController employeeController = new EmployeeController();
    private final Scanner sc = new Scanner(System.in);

    public void displayMainMenu() {
        do {
            System.out.println("---------MENU---------");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            //TODO check input option
            System.out.print("Enter your option: ");
            int option;
            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }

            switch (option) {
                case 1:
                    //TODO Employee Menu
                    do {
                        System.out.println("------------------------");
                        System.out.println("1. Display list employee");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Delete employee");
                        System.out.println("4. Edit employee");
                        System.out.println("5. Return main menu");

                        System.out.print("Enter your option: ");
                        int optionEmployee;
                        try {
                            optionEmployee = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println(e.getMessage());
                            continue;
                        }
                        switch (optionEmployee) {
                            case 1:
                                List<Employee> employeeList = this.employeeController.displayEmployee();

                                for (Employee emp : employeeList) {
                                    System.out.println(emp);
                                }
                                break;
                            case 2:
                                System.out.println("----Please write full information to add new Employee----");

                                System.out.println("Enter employee code:");
                                String empCode = sc.nextLine();

                                System.out.println("Enter employee name:");
                                String empName = sc.nextLine();

                                System.out.println("Enter employee birthday:");
                                String empBirthday = sc.nextLine();

                                System.out.println("Enter employee gender:");
                                String empGender = sc.nextLine();

                                System.out.println("Enter employee ID Card:");
                                int empIDCard = Integer.parseInt(sc.nextLine());

                                System.out.println("Enter employee phone number:");
                                int empPhoneNumber = Integer.parseInt(sc.nextLine());

                                System.out.println("Enter employee email:");
                                String empEmail = sc.nextLine();

                                System.out.println("Enter employee literacy:");
                                String empLiteracy = sc.nextLine();

                                System.out.println("Enter employee position:");
                                String empPosition = sc.nextLine();

                                System.out.println("Enter employee salary:");
                                double empSalary = Double.parseDouble(sc.nextLine());

                                Employee employee = new Employee(empName, empBirthday, empGender, empIDCard, empPhoneNumber,
                                        empEmail, empCode, empLiteracy, empPosition, empSalary);
                                this.employeeController.addEmployee(employee);
                                break;
                            case 3:
                                System.out.println("Input employee code to delete:");
                                String deleteEmployee = sc.nextLine();

                                Employee employeeCode = new Employee(deleteEmployee);

                                this.employeeController.deleteEmployee(employeeCode);
                                break;
                            case 4:
                                System.out.println("----Please enter employee code and write full information to edit----");

                                System.out.println("Enter employee code to edit this employee:");
                                String empCodeNew = sc.nextLine();

                                System.out.println("Enter new employee name:");
                                String empNameNew = sc.nextLine();

                                System.out.println("Enter new employee birthday:");
                                String empBirthdayNew = sc.nextLine();

                                System.out.println("Enter new employee gender:");
                                String empGenderNew = sc.nextLine();

                                System.out.println("Enter new employee ID Card:");
                                int empIDCardNew = Integer.parseInt(sc.nextLine());

                                System.out.println("Enter new employee phone number:");
                                int empPhoneNumberNew = Integer.parseInt(sc.nextLine());

                                System.out.println("Enter new employee email:");
                                String empEmailNew = sc.nextLine();

                                System.out.println("Enter new employee literacy:");
                                String empLiteracyNew = sc.nextLine();

                                System.out.println("Enter new employee position:");
                                String empPositionNew = sc.nextLine();

                                System.out.println("Enter new employee salary:");
                                double empSalaryNew = Double.parseDouble(sc.nextLine());

                                Employee employeeUpdate = new Employee(empNameNew, empBirthdayNew, empGenderNew, empIDCardNew,
                                        empPhoneNumberNew, empEmailNew, empCodeNew, empLiteracyNew, empPositionNew, empSalaryNew);

                                this.employeeController.editEmployee(employeeUpdate);
                            case 5:
                                this.displayMainMenu();
                            default:
                                System.out.println("Invalid option!");
                        }
                    } while (true);
                case 2:
                    //TODO Customer Menu
                    do {
                        System.out.println("------------------------");
                        System.out.println("1. Display list customer");
                        System.out.println("2. Add new customer");
                        System.out.println("3. Edit customer");
                        System.out.println("4. Return main menu");

                        System.out.print("Enter your option: ");
                        int optionCustomer;
                        try {
                            optionCustomer = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println(e.getMessage());
                            continue;
                        }

                        switch (optionCustomer) {
                            case 1:

                            case 2:

                            case 3:

                            case 4:
                                this.displayMainMenu();
                            default:
                                System.out.println("Invalid option!");
                        }
                    } while (true);
                case 3:
                    //TODO Facility Menu
                    do {
                        System.out.println("------------------------");
                        System.out.println("1. Display list facility");
                        System.out.println("2. Add new facility");
                        System.out.println("3. Display list facility maintenance");
                        System.out.println("4. Return main menu");

                        System.out.print("Enter your option: ");
                        int optionFacility;
                        try {
                            optionFacility = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println(e.getMessage());
                            continue;
                        }

                        switch (optionFacility) {
                            case 1:

                            case 2:

                            case 3:

                            case 4:
                                this.displayMainMenu();
                            default:
                                System.out.println("Invalid option!");
                        }
                    } while (true);
                case 4:
                    //TODO Booking Menu
                    do {
                        System.out.println("------------------------");
                        System.out.println("1. Display list booking");
                        System.out.println("2. Add new booking");
                        System.out.println("3. Return main menu");

                        System.out.print("Enter your option: ");
                        int optionBooking;
                        try {
                            optionBooking = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println(e.getMessage());
                            continue;
                        }

                        switch (optionBooking) {
                            case 1:

                            case 2:

                            case 3:
                                this.displayMainMenu();
                            default:
                                System.out.println("Invalid option!");
                        }
                    } while (true);
                case 5:
                    //TODO Promotion Menu
                    do {
                        System.out.println("------------------------");
                        System.out.println("1. Display list customers use service");
                        System.out.println("2. Display list customers get voucher");
                        System.out.println("3. Return main menu");

                        System.out.print("Enter your option: ");
                        int optionPromotion;
                        try {
                            optionPromotion = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println(e.getMessage());
                            continue;
                        }

                        switch (optionPromotion) {
                            case 1:

                            case 2:

                            case 3:
                                this.displayMainMenu();
                            default:
                                System.out.println("Invalid option!");
                        }
                    } while (true);
                case 6:
                    System.exit(1);
                default:
                    System.out.println("Invalid option!");
            }
        } while (true);
    }
}
