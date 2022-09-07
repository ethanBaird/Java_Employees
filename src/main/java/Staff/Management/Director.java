package Staff.Management;

import Staff.Employee;

public class Director extends Employee {

    private double budget;

    public Director(String name, String nationalInsurance, double salary, double budget) {
        super(name, nationalInsurance, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    @Override
    public double payBonus(){
        return this.salary/50;
    }
}
