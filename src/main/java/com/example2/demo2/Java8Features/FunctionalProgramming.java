package com.example2.demo2.Java8Features;

import lombok.extern.log4j.Log4j2;

import java.util.function.Function;
import java.util.function.Predicate;

@Log4j2
public class FunctionalProgramming {

    public static void main(String[] args) {
        // Function functional interface
        Function<Long, String> adder = (value) -> String.valueOf(value + 3);
        String resultLambda = adder.apply((long) 8);
        System.out.println(resultLambda==String.class + resultLambda);

        Predicate pr = new Predicate() {
            @Override
            public boolean test(Object o) {
                return o instanceof String;

            }
        };

        boolean check = pr.test(3);
        System.out.println(check);
    }
}
