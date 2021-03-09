package TestsBase;

import Utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    protected static WebDriver driver;
    protected static String browser;
    protected static String url;
    protected static String username;
    protected static String password;

    public static void getUserProperties(String propertyPath) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(System.getProperty(propertyPath)));
        browser = properties.getProperty("browser");
        url = properties.getProperty("url");
    }

    public static void getAdminProperties(String propertyPath) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(System.getProperty("user.dir") + propertyPath));
        browser = properties.getProperty("browser");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
    }

    @BeforeTest
    protected static void openBrowser() {
        driver = DriverManager.init(browser);
        driver.get(url);
    }

    @AfterTest
    void after() {
        driver.quit();
    }

}
