package oal.oracle.apps;

import java.util.List;
import java.util.stream.IntStream;
import java.util.Collections.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FizzBuzzSimple {
    public FizzBuzzSimple() {
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


    public String createList(int maxValue){
        return IntStream.rangeClosed(1,maxValue)
                        .mapToObj(e -> getWord(e))
                     .collect(Collectors.joining(", "));
    }
    public void printResult(List<String> words) {
        words.stream().forEach(System.out::println);
        
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
     
        FizzBuzzSimple game = new FizzBuzzSimple();
        int limit = 30;
        if(game.checkBoundary(limit))
            System.out.println(game.createList(limit));
        else
            System.out.println("Invalid number : Enter a number greater than 0 ");
        
    }

    public Boolean checkBoundary(int limit) {
        if(limit < 1)
            return false;
        return true;
    }
}
