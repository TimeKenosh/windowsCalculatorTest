package app.windows.calculator;

import app.windows.calculator.pages.ClassicCalculatorPO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StandardOperatorsTests extends BasicTest {

    @Test(description = "Adding test")
    public void addingTest() {

        String actualResult = new ClassicCalculatorPO(CalculatorSession).
                clickTwo().
                clickPlus().
                clickTwo().
                clickEqual().
                getResult();
        String expectedResult = "4";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Subtraction test")
    public void subtractionTest(){

        String actualResult = new ClassicCalculatorPO(CalculatorSession).
                clickFour().
                clickTwo().
                clickMinus().
                clickOne().
                clickFive().
                clickEqual().
                getResult();
        String expectedResult = "27";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Multiply test")
    public void multiplyTest(){
        String actualResult = new ClassicCalculatorPO(CalculatorSession).
                clickSeven().
                clickMultiplication().
                clickSix().
                clickEqual().
                getResult();
        String expectedResult = "42";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Divide test")
    public void divideTest(){

        String actualResult = new ClassicCalculatorPO(CalculatorSession).
                clickEight().
                clickZero().
                clickDivision().
                clickEight().
                clickEqual().
                getResult();
        String expectedResult = "10";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Add two numbers")
    public void addTwoNumbersTest(){

        String actualResult = new ClassicCalculatorPO(CalculatorSession).
                addTwoNumbers("Один", "Шість").
                getResult();
        String expectedResult = "7";
        Assert.assertEquals(actualResult, expectedResult);
    }
}
