package employees;

public abstract class Employee {

    private String firstName;
    private String lastName;
    private int id;

    public abstract void setMonthlySalary(double hours, double monthlySalary);

    public abstract void setHours(double hours);

    public abstract double getPercentOfSalary();

}
