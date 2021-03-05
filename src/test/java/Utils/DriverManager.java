package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.config.DriverManagerType.CHROME;
import static io.github.bonigarcia.wdm.config.DriverManagerType.FIREFOX;

public class DriverManager {
    private static WebDriver driver;

    public static WebDriver init(String browser){
        switch(browser) {
            case "chrome":
                driver = setChrome();
                break;
            case "firefox":
                driver = setFirefox();
                break;
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver setChrome() {
        WebDriverManager.getInstance(CHROME).setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        return driver;
    }

    public static WebDriver setFirefox() {
        WebDriverManager.getInstance(FIREFOX).setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
