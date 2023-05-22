package javaFeatures;

import testdata.Employee;
import testdata.Manager;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Features {
    public static void main(String[] args) {
        //Integer id, String name, Integer phoneNumber, String department
        Employee rohan = new Employee(1, "rohan", 12345, "Technology");
        Employee riddhi = new Employee(2, "riddhi", 23456, "Testing");

        List<Employee> employees = Arrays.asList(rohan, riddhi);

        Map<String, List<Employee>> employeeByDepartment = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(employeeByDepartment);

        //-------------------------------------------------------------

        Manager ra = new Manager(1, "rohan", 12345, "Technology", 1000);
        Manager rg = new Manager(2, "riddhi", 23456, "Testing", 2000);

        Double salary = Stream.of(ra, rg)
                .collect(Collectors.averagingDouble(Manager::getSalary));

        System.out.println(salary);

    }
}
