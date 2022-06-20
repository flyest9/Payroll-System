package payment;

import java.util.Calendar;

public class Partime extends Staff {

    public Partime(String firstName, String lastName, char gender, Calendar birthOfDate, String IDNumber, double hourlyRate, int workedWeek) {
        super(firstName, lastName, gender, birthOfDate, IDNumber, hourlyRate);
        workedPerWeek = workedWeek;
    }

    @Override
    public double monthlyEarning() {
        return getHourlyRate() * workedPerWeek * 4;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ID Employee number: " + getIDNumber() + "\n");
        builder.append("Employee name: " + getfirstName() + " " + getLastName() + "\n");
        builder.append("Birth date: " + getBirth().getTime().toString() + "\n");
        builder.append("Hours works per month: " + workedPerWeek + "\n");
        builder.append("Monthly Salary: " + monthlyEarning() + "\n");
        return builder.toString();
    }

    public int getWorkedPerWeek() {
        return workedPerWeek;
    }

    public void setWorkedPerWeek(int workedPerWeek) {
        this.workedPerWeek = workedPerWeek;
    }

    private int workedPerWeek;
}
