package Tests;

import Pages.AdminPage;
import TestsBase.AdminBaseTest;
import Utils.Utils;
import org.testng.annotations.Test;
import java.io.IOException;

public class LoginTest extends AdminBaseTest {

    @Test(description = "Login to admin page")
    public void test() throws IOException {
        AdminPage adminPage = new AdminPage(driver);
        adminPage.login(username, password);
        Utils.takeScreenshot(driver);
    }
}

