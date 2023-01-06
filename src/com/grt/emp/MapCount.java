package com.grt.emp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapCount {
    public static void main(String[] args) {

        String s="java is a java";
        List<String> l= Arrays.asList(s.split(" "));
        Map<String,Long> map=l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

    }
}


