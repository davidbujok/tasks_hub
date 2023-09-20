package Management;

public class Director extends  Manager{
    private Double budget;
    public Director(String name, Long ni_number, Double salary, String deptName, Double budget) {
        super(name, ni_number, salary, deptName);
        this.budget = budget;
    }
    public Double getBudget() {
        return budget;
    }

    public Double payBonus() {
        return getSalary() * 0.02;
    }
}
