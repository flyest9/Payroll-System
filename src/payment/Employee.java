package payment;

import java.util.Calendar;

import java.util.Calendar;

public abstract class Employee implements EmployeeInfo, Comparable<Employee> {

    private String lastName;
    private String firstName;
    private String IDNumber;
    private Calendar birthOfDate;
    private char gender;

    //constructor
    public Employee(String lastName, String firstName, String IDNumber, Calendar birthOfDate, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.IDNumber = IDNumber;
        this.birthOfDate = birthOfDate;
        this.gender = gender;

    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public char getgender() {
        return gender;
    }

    public void setgender(char gender) {
        this.gender = gender;
    }

    public Calendar getBirth() {
        return birthOfDate;
    }

    public void setBirth(Calendar birth) {
        this.birthOfDate = birth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ID Employee number: " + IDNumber + "\n");
        builder.append("Employee name: " + firstName + " " + lastName + "\n");
        builder.append("Birth date: " + birthOfDate.getTime().toString() + "\n");

        return builder.toString();
    }

    @Override
    public int compareTo(Employee o) {
        if (this.IDNumber.compareTo(o.getIDNumber()) == -1) {
            return 1;
        } else if (this.IDNumber.compareTo(o.getIDNumber()) == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public abstract double monthlyEarning();
}
