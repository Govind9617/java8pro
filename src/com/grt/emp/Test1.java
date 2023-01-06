package com.grt.emp;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 2, 5, 8, 6,5,6, 78, 87, 23);
        Set<Integer> dupList=new HashSet();
        List<Integer> l=list.stream().filter(x->x%2==0).collect(Collectors.toList());
        List<String> l1=list.stream().map(integer -> integer+"").filter(x->x.startsWith("8")).collect(Collectors.toList());
        List<Integer> l2=list.stream().filter(x-> !dupList.add(x)).collect(Collectors.toList());
        long i=list.stream().count();
   //     Optional<Integer> i1=list.stream().sorted().skip(3).findFirst().stream().collect(Collectors.maxBy((o1, o2) -> ));;
        System.out.println(i );
    }
}
