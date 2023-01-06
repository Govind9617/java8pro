package com.grt.emp;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("ten", 10);
        map.put("seven", 7);
        map.put("two", 2);
        Map<Employee, Integer> employeeMap = new HashMap<>();
        employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
        employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
        employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
        employeeMap.put(new Employee(624, "Bimal", "CORE", 400000), 40);
        employeeMap.put(new Employee(284, "Prakash", "SOCIAL", 1200000), 120);

        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).distinct()
                .forEach(System.out::println);
//        List<Map.Entry<String,Integer>> entries=new ArrayList<>(map.entrySet());
////        Map.Entry<String,Integer> entry= (Map.Entry<String, Integer>) map.entrySet();
//        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);


    }
}
