package Management;

import Staff.Employee;

public abstract class Manager extends Employee {
    private String deptName;
    public Manager(String name, Long ni_number, Double salary, String deptName) {
        super(name, ni_number, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

}
