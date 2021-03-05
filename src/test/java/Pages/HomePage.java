package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {

    @FindBy (xpath = "//a[contains(@href,'catalog')]")
    private WebElement productPage;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ProductPage openProductsPage() {
        productPage.click();
        return new ProductPage(driver);
    }
}
