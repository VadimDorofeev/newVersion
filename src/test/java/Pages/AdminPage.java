package Pages;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Page {

    private static Logger LOGGER = LogManager.getLogger(AdminPage.class);

    public AdminPage(WebDriver driver){
        super(driver);
    }

    @FindBy (xpath="//input[@name='username']")
    private WebElement username;

    @FindBy (xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy (xpath = "//button[@name='login']")
    private WebElement loginButton;

    @Step("Login to admin page with {0} username and {1} password")
    public HomePage login(String nameValue, String passwordValue) {
        LOGGER.info("Login to admin page");
        LOGGER.info("Enter username");
        username.sendKeys(nameValue);
        LOGGER.info("Enter password");
        password.sendKeys(passwordValue);
        LOGGER.info("Clicking on login button");
        loginButton.click();
        return new HomePage(driver);
    }
}
