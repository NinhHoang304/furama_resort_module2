package views;

import common.exception.NotFoundInDatabase;
import common.validate.RegexFacility;
import controllers.CustomerController;
import controllers.EmployeeController;
import controllers.FacilityController;
import models.facility.Facility;
import models.facility.Room;
import models.facility.Villa;
import models.person.Customer;
import models.person.Employee;
import models.person.Person;
import models.person.dependency.CustomerCode;

import java.util.*;
import java.util.regex.Pattern;

public class FuramaView {
    private final EmployeeController employeeController = new EmployeeController();
    private final CustomerController customerController = new CustomerController();
    private final FacilityController facilityController = new FacilityController();

    private final RegexFacility regexFacility = new RegexFacility();
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
                                System.out.println("----Enter information to add new employee----");

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
                                String codeEmp = sc.nextLine();

                                Employee employeeCode = new Employee(codeEmp);

                                this.employeeController.deleteEmployee(employeeCode);
                                break;
                            case 4:
                                System.out.println("----Please enter employee code to edit----");

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
                                break;
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
                                List<Customer> customerList = this.customerController.displayCustomer();
                                for (Customer customer : customerList) {
                                    System.out.println(customer);
                                }
                                break;
                            case 2:
                                System.out.println("----Enter information to add new customer----");

                                System.out.println("Enter customer code:");
                                String cusCode = sc.nextLine();

                                System.out.println("Enter customer name:");
                                String cusName = sc.nextLine();

                                System.out.println("Enter customer birthday:");
                                String cusBirthday = sc.nextLine();

                                System.out.println("Enter customer gender:");
                                String cusGender = sc.nextLine();

                                System.out.println("Enter customer ID Card:");
                                int cusIDCard = Integer.parseInt(sc.nextLine());

                                System.out.println("Enter customer phone number:");
                                int cusPhoneNumber = Integer.parseInt(sc.nextLine());

                                System.out.println("Enter customer email:");
                                String cusEmail = sc.nextLine();

                                System.out.println("Enter customer type:");
                                String cusTypes = sc.nextLine();

                                System.out.println("Enter customer address:");
                                String cusAddress = sc.nextLine();

                                Customer customerAdd = new Customer(cusName, cusBirthday, cusGender, cusIDCard,
                                        cusPhoneNumber, cusEmail, cusCode, cusTypes, cusAddress);
                                this.customerController.addCustomer(customerAdd);
                                break;
                            case 3:
                                System.out.println("----Please enter customer code to edit----");

                                System.out.println("Enter customer code to edit this customer:");
                                String cusCodeNew = sc.nextLine();

                                System.out.println("Enter new customer name:");
                                String cusNameNew = sc.nextLine();

                                System.out.println("Enter new customer birthday:");
                                String cusBirthdayNew = sc.nextLine();

                                System.out.println("Enter new customer gender:");
                                String cusGenderNew = sc.nextLine();

                                System.out.println("Enter new customer ID Card:");
                                int cusIDCardNew = Integer.parseInt(sc.nextLine());

                                System.out.println("Enter new customer phone number:");
                                int cusPhoneNumberNew = Integer.parseInt(sc.nextLine());

                                System.out.println("Enter new customer email:");
                                String cusEmailNew = sc.nextLine();

                                System.out.println("Enter new customer type:");
                                String cusTypesNew = sc.nextLine();

                                System.out.println("Enter new customer address:");
                                String cusAddressNew = sc.nextLine();

                                Customer customerUpdate = new Customer(cusNameNew, cusBirthdayNew, cusGenderNew, cusIDCardNew,
                                        cusPhoneNumberNew, cusEmailNew, cusCodeNew, cusTypesNew, cusAddressNew);
                                this.customerController.editCustomer(customerUpdate);
                                break;
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
                                this.facilityController.displayFacility();
                                break;
                            case 2:
                                do {
                                    System.out.println("------------------------");
                                    System.out.println("1. Add new villa");
                                    System.out.println("2. Add new room");
                                    System.out.println("3. Back to menu");
                                    System.out.print("Enter your option: ");
                                    int optionFacilityNew;
                                    try {
                                        optionFacilityNew = Integer.parseInt(sc.nextLine());
                                    } catch (NumberFormatException e) {
                                        System.out.println(e.getMessage());
                                        continue;
                                    }

                                    switch (optionFacilityNew) {
                                        case 1:
                                            System.out.println("----Enter information to add new villa----");

                                            System.out.println("Enter id facility villa (SVVL-0001): ");
                                            String idFacilityVilla = validateFacility(this.regexFacility.REGEX_ID_SERVICE);

                                            System.out.println("Enter name service (Villa): ");
                                            String nameVilla = validateFacility(this.regexFacility.REGEX_NAME_SERVICE);

                                            System.out.println("Enter usable area ( > 30m2 ): ");
                                            double usableAreaVilla = Double.parseDouble(validateFacility(this.regexFacility.REGEX_AREA));

                                            System.out.println("Enter cost for rent villa (vd: 1000 - 5000$): ");
                                            double costVilla = Double.parseDouble(validateFacility(this.regexFacility.REGEX_RENT_COST));

                                            System.out.println("Enter maximum people for rent villa (0 < people < 20): ");
                                            int maxPeopleVilla = Integer.parseInt(validateFacility(this.regexFacility.REGEX_MAX_PEOPLE));

                                            System.out.println("Enter rent type (Day, Month, Year): ");
                                            String rentTypesVilla = validateFacility(this.regexFacility.REGEX_RENT_TYPE);

                                            System.out.println("Enter villa type (Standard|Deluxe|Suite|President): ");
                                            String villaType = validateFacility(this.regexFacility.REGEX_ROOM_TYPE);

                                            System.out.println("Enter pool area (> 30m2): ");
                                            Double poolArea = Double.parseDouble(validateFacility(this.regexFacility.REGEX_AREA));

                                            System.out.println("Enter floor of villa: ");
                                            int floor = Integer.parseInt(validateFacility(this.regexFacility.REGEX_FLOOR));

                                            Villa villa = new Villa(idFacilityVilla, nameVilla, usableAreaVilla, costVilla, maxPeopleVilla,
                                                    rentTypesVilla, villaType, poolArea, floor);
                                            this.facilityController.addFacility(villa);

                                            break;
                                        case 2:
                                            System.out.println("----Enter information to add new room----");

                                            System.out.println("Enter id facility room (SVRO-0001): ");
                                            String idFacilityRoom = validateFacility(this.regexFacility.REGEX_ID_SERVICE);

                                            System.out.println("Enter name service (Room): ");
                                            String nameRoom = validateFacility(this.regexFacility.REGEX_NAME_SERVICE);

                                            System.out.println("Enter usable area ( > 30m2 ): ");
                                            double usableAreaRoom = Double.parseDouble(validateFacility(this.regexFacility.REGEX_AREA));

                                            System.out.println("Enter cost for rent room (vd: 500 - 2000$): ");
                                            double costRoom = Double.parseDouble(validateFacility(this.regexFacility.REGEX_RENT_COST));

                                            System.out.println("Enter maximum people for rent room (0 < people < 20): ");
                                            int maxPeopleRoom = Integer.parseInt(validateFacility(this.regexFacility.REGEX_MAX_PEOPLE));

                                            System.out.println("Enter rent type (Day, Month, Year): ");
                                            String rentTypesRoom = validateFacility(this.regexFacility.REGEX_RENT_TYPE);

                                            System.out.println("Enter free service for room (Coffee|Buffet|Spa): ");
                                            String freeService = validateFacility(this.regexFacility.REGEX_FREE_SERVICE);

                                            Room room = new Room(idFacilityRoom, nameRoom, usableAreaRoom, costRoom, maxPeopleRoom, rentTypesRoom, freeService);
                                            this.facilityController.addFacility(room);

                                            break;
                                        case 3:
                                            this.displayMainMenu();
                                        default:
                                            System.out.println("Invalid choice");
                                    }
                                } while (true);
                            case 3:
                                this.facilityController.displayFacilityMaintenance();
                                break;
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

    // TODO validate facility
    public String validateFacility(String stringRegex) {
        String temp;
        while (true){
            temp = sc.nextLine();
            if (Pattern.matches(stringRegex, temp)){
                System.out.println("Add Successful!");
                break;
            }else{
                System.err.println("Input invalid. Please try again!");
            }
        }

        return temp;
    }
}
