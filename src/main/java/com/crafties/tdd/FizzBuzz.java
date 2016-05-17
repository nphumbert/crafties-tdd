package com.crafties.tdd;

public class FizzBuzz {

    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";

    public String display(int number) {

        if (number % 3 == 0) {
            return FIZZ;
        }

        if (number % 5 == 0) {
            return BUZZ;
        }

        return Integer.toString(number);
    }

}
