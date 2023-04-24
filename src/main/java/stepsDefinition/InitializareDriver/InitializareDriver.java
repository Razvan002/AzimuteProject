package stepsDefinition.InitializareDriver;

import io.cucumber.java.After;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InitializareDriver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver != null) {
            return driver;
        }
        else {
            throw new IllegalStateException("Driver has not been initialized. " +
                    "Please call InitializareDriver.setup() before use this method");
        }
    }



    public static void setup(String url) {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/src/main/java/driver/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @After
    public static void tearDown() {
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
