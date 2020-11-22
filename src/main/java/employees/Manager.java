package employees;

public class Manager extends Employee{

    private String firstName;
    private String lastName;
    private int id;
    private double hours;
    private double monthlySalary;
    private double percentOfSalary;

    public Manager(int id, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public void setMonthlySalary(double hours, double monthlySalary) {
        this.monthlySalary = monthlySalary * hours / 40;
        this.percentOfSalary = hours * 100 / 40 - 100;
    }

    @Override
    public void setHours(double hours) {
    }

    @Override
    public double getPercentOfSalary() {
        return this.percentOfSalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public int getId() {
        return id;
    }
}
