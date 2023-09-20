package Staff;

public abstract class Employee {
    private String name;
    private Long ni_number;
    private Double salary;

    public Employee(String name, Long ni_number, Double salary) {
        this.name = name;
        this.ni_number = ni_number;
        this.salary = salary;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
        this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void raiseSalary(Double payRisePercent){
        if (payRisePercent > 0) {
            Double payRise = this.salary * (payRisePercent / 100);
            setSalary(this.salary + payRise);
        } else {
            setSalary(this.salary);
        }
    }
    public Double payBonus(){
        return this.salary * 0.01;
    }
    public Double payBonus(Double percentage){
        return this.salary * percentage;
    }
}
