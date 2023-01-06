package com.grt.emp;

import java.util.ArrayList;
import java.util.List;

public class Sort {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(19);
        list.add(11);
        List<Employee> employees = DataBase.getEmployees();
//    Collections.sort(employees, new Comparator<Employee>() {
//        @Override
//        public int compare(Employee o1, Employee o2) {
//            return (int) (o2.getSalary()-o1.getSalary());
//        }
//    });

//    employees.stream().sorted((o1,o2)-> (int) (o1.getSalary()-o2.getSalary())).forEach(System.out::println);
//    employees.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);
        //  employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).forEach(employee -> {employee.getDept()};);


//        Collections.sort(list);
//        Collections.reverse(list);
//        System.out.println(list);
        //      list.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.print(s+ " "));



    }


}
