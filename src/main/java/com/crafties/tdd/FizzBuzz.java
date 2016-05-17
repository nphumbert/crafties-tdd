package com.crafties.tdd;

public class FizzBuzz {

    private static final String FIZZ = "fizz";

    public String display(int number) {

        if (number % 3 == 0) {
            return FIZZ;
        }

        return Integer.toString(number);
    }

}
