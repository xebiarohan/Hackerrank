package concepts;

import testdata.Employee;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        Employee rohan = new Employee(1, "rohan", 1234, "Technical");
        Employee riddhi = new Employee(1, "riddhi", 5678, "Testing");
        List<Employee> list = new ArrayList<>();

        List<Integer> integers = Arrays.asList(1,2,3,4);

        list.add(rohan);
        list.add(riddhi);


        list.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getDepartment));

        integers.sort(Comparator.reverseOrder());

    }
}
