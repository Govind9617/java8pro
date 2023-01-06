package com.grt.emp;

import java.util.Arrays;
import java.util.Optional;

import static java.util.Optional.empty;

public class Optinalddemo {
    public static void main(String[] args) {
        Customer customer = new Customer(101, "john", null, Arrays.asList("789729847", "9824879239"));
        Optional<Object> emOptional = empty();
        System.out.println(emOptional);


    }
}
