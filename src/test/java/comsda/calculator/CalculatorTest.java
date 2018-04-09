package comsda.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.Callable;

public class CalculatorTest {
    private Calculator calculator;
    @Before
    public void init() {
        this.calculator = new Calculator();
    }

    @Test // nalezy dopisac
    public void testAdd(){
        //when
        int sum = calculator.sum(3,5);
        //then
        Assert.assertEquals("result is not 8",8,sum);
    }
    @Test
    public void testAddMultiply(){
        //when
        int multiply = calculator.multiply(2,5);
        //then
        Assert.assertEquals(10 , multiply );
    }
    @Test
    public void testAddSubstract(){
        //when
        int substract = calculator.substract(8,4);
        //then
        Assert.assertEquals(4,substract);

    }
    @Test
    public void testAddDivide(){

        int divide = calculator.divide(10,2);
        Assert.assertEquals(5,divide);
    }
}
