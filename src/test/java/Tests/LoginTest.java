package Tests;

import Pages.AdminPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class LoginTest extends AdminBaseTest {

    Logger logger = LoggerFactory.getLogger(LoginTest.class);

    @Test(description = "Login to admin page")
    public void test() {
        logger.info("Start login test");
        AdminPage adminPage = new AdminPage(driver);
        adminPage.login(username,password);
        logger.info("Stop login test");
    }
}
