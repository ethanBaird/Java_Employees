package Staff;

public abstract class Employee {

    protected String name;
    protected String nationalInsurance;
    protected double salary;

    public Employee(String name, String nationalInsurance, double salary) {
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNationalInsurance() {
        return nationalInsurance;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double salaryIncrease){
        if (salaryIncrease > 0) {
            this.salary += salaryIncrease;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

    public void setName(String name) {
        if (!name.isEmpty() && !name.contains(" ")){
            this.name = name;
        }
    }
}
