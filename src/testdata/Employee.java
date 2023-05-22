package testdata;

public class Employee {
    private String name;
    private Integer id;
    private Integer phoneNumber;
    private String department;

    public Employee(Integer id, String name, Integer phoneNumber, String department) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phoneNumber=" + phoneNumber +
                ", department='" + department + '\'' +
                '}';
    }
}
