package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AdminPage extends Page {

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
        username.sendKeys(nameValue);
        password.sendKeys(passwordValue);
        loginButton.click();
        return new HomePage(driver);
    }
}
