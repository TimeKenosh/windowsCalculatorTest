package app.windows.calculator;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasicTest {

    protected static WindowsDriver CalculatorSession;

    DesiredCapabilities capabilities;

    @BeforeClass(description = "Set up appium")
    public void setUpCapabilities() {

        capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        capabilities.setCapability("platformName", "Windows");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("deviceName", "WindowsPC");
    }

    @BeforeMethod(description = "Open Windows calculator and set up")
    public void setUp() throws MalformedURLException {

        CalculatorSession = new WindowsDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        CalculatorSession.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    @AfterMethod(description = "Close Windows calculator")
    public void cleanUp(){
        CalculatorSession.quit();
    }
}
