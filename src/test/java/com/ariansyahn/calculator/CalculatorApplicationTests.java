package com.ariansyahn.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)
@SpringBootTest
public class CalculatorApplicationTests {

    private Calculator calculator;
    @Before
    public void setup(){
        calculator = new Calculator();
    }
    @Test
    public void calculateSum(){
        int result = calculator.sum(1,2);
        System.out.println("Sum Result : "+result);
        assertEquals(3,result);
    }

    @Test
    public void calculateSubstract(){
        int result = calculator.substract(3,2);
        System.out.println("Substract Result : "+result);
        assertEquals(1,result);
    }

    @Test
    public void calculateMultiply(){
        int result = calculator.multiply(5,2);
        System.out.println("Multiply Result : "+result);
        assertEquals(10,result);
    }

    @Test
    public void calculateDivide(){
        double result = calculator.divide(5,2);
        System.out.println("Division Result : "+result);
        assertEquals(2.5,result,0);
    }

    @Test
    public void calculateSqrt(){
        double result = calculator.sqrt(9);
        System.out.println("Square Root Result : "+result);
        assertEquals(3.0,result,0);
    }

    @Test
    public void calculatePow(){
        double result = calculator.pow(3,2);
        System.out.println("Pow Result : "+result);
        assertEquals(9.0,result,0);
    }

    @Test
    public void calculatePercentage(){
        double result = calculator.percentage(9);
        System.out.println("Percentage Result : "+result);
        assertEquals(0.09,result,0);
    }

}
