package Base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;

    protected static void testSet() {
    }


    public static void testSetup() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") +
                            "\\src\\test\\resources\\executables\\chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
    }

    public static void cleanUp() {
        if (driver != null) {

            driver.quit();
        }
    }
}
