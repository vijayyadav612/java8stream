package stream;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class FindMaxSalaryByDept {

    public static void main(String[] args) {

        // list of emp from various departments , write a program to find highest paid salary for each of department

        List<Employee> employeeList = Arrays.asList(new Employee(1L, "vijay", "DEV", 100000.00),
                new Employee(2L, "Ajeet", "DEV", 90000.00),
                new Employee(3L,"Neha", "QA", 50000.00),
                new Employee(4L, "Niya", "QA", 60000.00),
                new Employee(5L, "Sandeep", "DEVOPS", 61000.00));

        Comparator<Employee> comparing = Comparator.comparing(Employee::getSalary);

        Map<String, Optional<Employee>> empMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.reducing(BinaryOperator.maxBy(comparing))));

        System.out.println(empMap);
    }


}
