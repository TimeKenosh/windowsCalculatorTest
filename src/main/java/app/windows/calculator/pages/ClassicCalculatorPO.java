package app.windows.calculator.pages;

import io.appium.java_client.windows.WindowsDriver;

public class ClassicCalculatorPO extends BasePage {

    public ClassicCalculatorPO(WindowsDriver driver) {
        super(driver);
    }

    public ClassicCalculatorPO clickZero() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.ZERO).click();
        return this;
    }

    public ClassicCalculatorPO clickOne() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.ONE).click();
        return this;
    }

    public ClassicCalculatorPO clickTwo() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.TWO).click();
        return this;
    }

    public ClassicCalculatorPO clickThree() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.THREE).click();
        return this;
    }

    public ClassicCalculatorPO clickFour() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.FOUR).click();
        return this;
    }

    public ClassicCalculatorPO clickFive() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.FIVE).click();
        return this;
    }

    public ClassicCalculatorPO clickSix() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.SIX).click();
        return this;
    }

    public ClassicCalculatorPO clickSeven() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.SEVEN).click();
        return this;
    }

    public ClassicCalculatorPO clickEight() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.EIGHT).click();
        return this;
    }

    public ClassicCalculatorPO clickNine() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.NINE).click();
        return this;
    }

    public ClassicCalculatorPO clickDot() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.DOT).click();
        return this;
    }

    public ClassicCalculatorPO clickPositiveNegative() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.POSITIVE_NEGATIVE).click();
        return this;
    }

    public ClassicCalculatorPO clickEqual() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.EQUAL).click();
        return this;
    }

    public ClassicCalculatorHelper clickPlus() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.PLUS).click();
        return new ClassicCalculatorHelper(driver);
    }

    public ClassicCalculatorHelper clickMinus() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.MINUS).click();
        return new ClassicCalculatorHelper(driver);
    }

    public ClassicCalculatorHelper clickDivision() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.DIVISION).click();
        return new ClassicCalculatorHelper(driver);
    }

    public ClassicCalculatorHelper clickMultiplication() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.MULTIPLICATION).click();
        return new ClassicCalculatorHelper(driver);
    }

    public ClassicCalculatorPO clickRoot() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.ROOT).click();
        return this;
    }

    public ClassicCalculatorPO clickSquare() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.SQUARE).click();
        return this;
    }

    public ClassicCalculatorPO clickInterest() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.INTEREST).click();
        return this;
    }

    public ClassicCalculatorPO clickInverseValue() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.INVERSE_VALUE).click();
        return this;
    }

    public ClassicCalculatorPO clickBackspace() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.BACKSPACE).click();
        return this;
    }

    public ClassicCalculatorPO clickClearTheLast() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.CLEAR_THE_LAST).click();
        return this;
    }

    public ClassicCalculatorPO clickClearEverything() {
        driver.findElementByAccessibilityId(ClassicCalculatorButtons.CLEAR_EVERYTHING).click();
        return this;
    }

    public String getResult() {
        return driver.findElementByAccessibilityId("CalculatorResults").getText().
                replace("Дисплей:", "").trim();
    }

    public ClassicCalculatorPO clickButton(String button) {
        driver.findElementByName(button).click();
        return this;
    }

    public String addTwoNumbers(int num1, int num2) {
        return new ClassicCalculatorHelper(driver).
                clickNumber(num1).
                clickPlus().
                clickNumber(num2).
                clickEqual().
                getResult();
    }

    public String subtractTwoNumbers(int num1, int num2) {
        return new ClassicCalculatorHelper(driver).
                clickNumber(num1).
                clickMinus().
                clickNumber(num2).
                clickEqual().
                getResult();
    }

    public String multiplyTwoNumbers(int num1, int num2) {
        return new ClassicCalculatorHelper(driver).
                clickNumber(num1).
                clickMultiplication().
                clickNumber(num2).
                clickEqual().
                getResult();
    }

    public String divideTwoNumbers(int num1, int num2) {
        return new ClassicCalculatorHelper(driver).
                clickNumber(num1).
                clickDivision().
                clickNumber(num2).
                clickEqual().
                getResult();
    }
}
