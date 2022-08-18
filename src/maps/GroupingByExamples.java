package maps;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByExamples {
    public static void main(String[] args) {

        Student rohan= new Student("Rohan", 29, new School("DAV"));
        Student riddhi= new Student("Riddhi", 28, new School("Maheshwari"));
        Student abc= new Student("abc", 28, new School("XYZ"));

        List<Student> students = Arrays.asList(rohan,riddhi,abc);

        Map<Integer, List<Student>> listExample = students.stream().collect(Collectors.groupingBy(Student::getAge));
        System.out.println(listExample);

        Map<Integer, Set<Student>> setExample = students.stream().collect(Collectors.groupingBy(Student::getAge, Collectors.toSet()));
        System.out.println(setExample);

        students.stream().collect(Collectors.groupingBy(Student::getSchool,Collectors.toList()));


    }
}
