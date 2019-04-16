package com.thoughtworks.tdd;

public class FizzBuzz {

    public String fizzBuzz(int i){
        String result = "";
        if (i % 3 == 0)
        {
            result += "Fizz";
        }
        if (i % 5 == 0)
        {
            result += "Buzz";
        }
        if (i % 7 == 0)
        {
            result += "Whizz";
        }

        if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0)
            result += i;


        return result;
    }

}
