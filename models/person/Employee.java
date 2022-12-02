package models.person;

public class Employee extends Person{

    private String employeeCode;
    private String literacy;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeCode, String literacy, String position, double salary) {
        this.employeeCode = employeeCode;
        this.literacy = literacy;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, String birthday, String gender, int idCard, int phoneNumber, String email, String employeeCode, String literacy, String position, double salary) {
        super(name, birthday, gender, idCard, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.literacy = literacy;
        this.position = position;
        this.salary = salary;
    }

    public String formatCSVFileEmployee() {
        return this.formatCSVFilePerson() + "," +
                this.employeeCode + "," +
                this.literacy + "," +
                this.position + "," +
                this.salary;
    }

    public String getLiteracy() {
        return literacy;
    }

    public void setLiteracy(String literacy) {
        this.literacy = literacy;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "literacy='" + literacy + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
