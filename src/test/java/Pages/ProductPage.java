package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Page {

    @FindBy (xpath = "//a[contains(@href,'edit_product')]")
    private WebElement addNewProductButton;

    @FindBy (xpath = "//input[@name='new_images[]']")
    private WebElement image;

    @FindBy (xpath = "//button[@name='save']")
    private WebElement addButton;

    @FindBy (xpath = "")
    private WebElement products;

    @FindBy (xpath = "//input[@name='name[en]']")
    private WebElement productName;

    public ProductPage(WebDriver driver){
        super(driver);
    }
}
