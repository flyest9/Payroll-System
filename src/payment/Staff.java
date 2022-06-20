package payment;

import java.util.Calendar;

public class Staff extends Employee {

    private double hourlyRate;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Staff(String firstName, String lastName, char gender, Calendar birthOfDate, String IDNumber, double hourlyRate) {
        super(firstName, lastName, IDNumber, birthOfDate, gender);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double monthlyEarning() {
        return hourlyRate * STAFF_MONTHLY_HOURS_WORKED;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append("Full Time\nMonthly Salary: " + monthlyEarning() + "\n");
        return builder.toString();
    }
}
