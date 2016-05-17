package com.crafties.tdd;

public class FizzBuzz {

    public String display(int number) {

        if (number % 3 == 0) {
            return "fizz";
        }

        return Integer.toString(number);
    }

}
