package app.windows.calculator;

import app.windows.calculator.pages.ClassicCalculatorPO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StandardOperatorsTests extends BasicTest {

    @Test(description = "Add two numbers")
    public void addTwoNumbersTest(){

        String actualResult = new ClassicCalculatorPO(driver).
                addTwoNumbers(156, 371);
        String expectedResult = "527";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Subtract two numbers")
    public void subtractTwoNumbersTest(){

        String actualResult = new ClassicCalculatorPO(driver).
                subtractTwoNumbers(500, 142);
        String expectedResult = "358";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Add two numbers")
    public void multiplyTwoNumbersTest(){

        String actualResult = new ClassicCalculatorPO(driver).
                multiplyTwoNumbers(19, 11);
        String expectedResult = "209";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Add two numbers")
    public void divideTwoNumbersTest(){

        String actualResult = new ClassicCalculatorPO(driver).
                divideTwoNumbers(192, 3);
        String expectedResult = "64";
        Assert.assertEquals(actualResult, expectedResult);
    }
}
