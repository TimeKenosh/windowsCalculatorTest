package app.windows.calculator.pages;

import com.google.common.collect.Lists;
import io.appium.java_client.windows.WindowsDriver;

import java.util.ArrayList;
import java.util.List;

public class ClassicCalculatorHelper extends ClassicCalculatorPO{

    public ClassicCalculatorHelper(WindowsDriver driver) {
        super(driver);
    }

    public ClassicCalculatorPO clickNumber(int number){
        List<Integer> listOfNumbers = intToList(number);
        clickEveryNumber(listOfNumbers);
        return new ClassicCalculatorPO(driver);
    }

    public List<Integer> intToList(int number) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (number != 0) {
            int lastNumber = number % 10;
            list.add(lastNumber);
            number /= 10;
        }
        return Lists.reverse(list);
    }

    public void clickEveryNumber(List<Integer> list){
        for (int i: list) {
            clicker(i);
        }
    }

    public void clicker(int number) {
        switch (number) {
            case 0:
                new ClassicCalculatorPO(driver).
                        clickZero();
                break;
            case 1:
                new ClassicCalculatorPO(driver).
                        clickOne();
                break;
            case 2:
                new ClassicCalculatorPO(driver).
                        clickTwo();
                break;
            case 3:
                new ClassicCalculatorPO(driver).
                        clickThree();
                break;
            case 4:
                new ClassicCalculatorPO(driver).
                        clickFour();
                break;
            case 5:
                new ClassicCalculatorPO(driver).
                        clickFive();
                break;
            case 6:
                new ClassicCalculatorPO(driver).
                        clickSix();
                break;
            case 7:
                new ClassicCalculatorPO(driver).
                        clickSeven();
                break;
            case 8:
                new ClassicCalculatorPO(driver).
                        clickEight();
                break;
            case 9:
                new ClassicCalculatorPO(driver).
                        clickNine();
                break;
        }
    }
}
