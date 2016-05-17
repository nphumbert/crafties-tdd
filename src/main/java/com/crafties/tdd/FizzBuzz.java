package com.crafties.tdd;

public class FizzBuzz {

    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";

    public String display(int number) {

        if (isMultipleOfThree(number)) {
            return FIZZ;
        }

        if (isMultipleOfFive(number)) {
            return BUZZ;
        }

        return Integer.toString(number);
    }

    private boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }

}
