package com.example2.demo2.Java8Features;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalProgramming {

    public static void main(String[] args) {
        // #Function interface
        Function<Long, String> adder = (value) -> String.valueOf(value + 3);
        String resultLambda = adder.apply((long) 8);
        System.out.println(resultLambda);

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
