package com.grt.emp;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Emp {


    public static void main(String[] args) {
        List<Employee1> employeeList=new ArrayList<>();
        employeeList.add(new Employee1(111,"naveen",32,"No","HR",2011,25000.0));
        employeeList.add(new Employee1(122,"raju",23,"yes","Man",2003,125000.0));
        employeeList.add(new Employee1(133,"babu",28,"Yes","BA",2014,55000.0));
        employeeList.add(new Employee1(144,"jaji",54,"No","HR",2000,225000.0));
        employeeList.add(new Employee1(155,"ram",32,"No","QA",2001,245000.0));
// max /min sal
        Optional<Employee1> employee1=employeeList.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee1::getSalary)));
    //    System.out.println(employee1);
        //max sall at each dept
   //    Map<String, Optional<Employee1>> map=employeeList.stream().collect(Collectors.groupingBy(Employee::getDept));

// print active inactive employee
   Map<String,Long>     map1=employeeList.stream().collect(Collectors.groupingBy(Employee1::getActive,Collectors.counting()));
     //   System.out.println(map1);
        // emp details each dept
      Map<String,List<Employee1>> map2=employeeList.stream().collect(Collectors.groupingBy(Employee1::getDepartment));
        System.out.println(map2);
        // working emp count working dept
        Map<String, Long> map3=employeeList.stream().collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.counting()));
        System.out.println(map3);
    }


}
