package testdata;

public class Manager extends Employee {

    public Integer salary;

    public Manager(Integer id, String name, Integer phoneNumber, String department, Integer salary) {
        super(id,name,phoneNumber,department);
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Managers{" +
                "salary=" + salary +
                '}';
    }
}
