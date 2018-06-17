package oal.oracle.apps;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FizzBuzz {
    public FizzBuzz() {
        super();
    }

    public String getWord(int number) {
        if (isMultipleOfThreeAndFive(number)) {
            return "FizzBuzz";
        }
        if (isMultipleOfThree(number)) {
            return "Fizz";
        } else if (isMultipleOfFive(number)) {
            return "Buzz";
        }

        return String.valueOf(number);
    }

    public String[] playFizzBuzz(int maxValue) {
        String[] result = new String[maxValue];
        for (int player = 0; player < maxValue; player++)
            result[player] = getWord(player + 1);
        return result;
    }

    public void printResult(String[] words) {
        String result = "[ ";
        for (String word : words)
            result += word+" ";
        result += "]";

        System.out.println(result);
        
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }

    private boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOfThreeAndFive(int number) {
        return isMultipleOfThree(number) && isMultipleOfFive(number);
    }
    
    public static void main(String[] args){
     
        FizzBuzz game = new FizzBuzz();
        int limit = 15;
        if(game.checkBoundary(limit))
            game.printResult(game.playFizzBuzz(limit));
        else
            System.out.println("Invalid number : Enter a number greater than 0 ");
        
    }

    public Boolean checkBoundary(int limit) {
        if(limit < 1)
            return false;
        return true;
    }
}
