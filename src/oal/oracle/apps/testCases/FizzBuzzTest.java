package oal.oracle.apps.testCases;

import java.util.List;

import oal.oracle.apps.FizzBuzz;

import oal.oracle.apps.FizzBuzzSimple;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzzSimple fizzbuzz;
    public FizzBuzzTest() {
    }

    @Before
    public void setUp() throws Exception {
        fizzbuzz  = new FizzBuzzSimple();
        
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testNumber(){
    
        String result = fizzbuzz.getWord(1);
        assertEquals("1",result);
    }
    
    @Test
    public void testFizz(){
        String result = fizzbuzz.getWord(3);
        assertEquals("Fizz",result);
        
    }
    
    @Test
    public void testBoundary(){
        assertEquals(false,fizzbuzz.checkBoundary(0));
    }
    
    @Test
    public void testBuzz(){
        String result = fizzbuzz.getWord(5);
        assertEquals("Buzz",result);
    }
    
    @Test
    public void testFizzBuzz(){
        String result = fizzbuzz.getWord(15);
        assertEquals("FizzBuzz",result);
    }

    
    @Test
    public void testFizzBuzzGame(){
        int n = 30;
        String expectedResult = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz";
        String finalResult =  fizzbuzz.createList(n);

        assertEquals(expectedResult, finalResult);

    }
}
