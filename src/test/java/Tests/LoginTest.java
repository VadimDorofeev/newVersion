package Tests;

import Pages.AdminPage;
import TestsBase.AdminBaseTest;
import org.testng.annotations.Test;

public class LoginTest extends AdminBaseTest {

    @Test(description = "Login to admin page")
    public void test() {
        AdminPage adminPage = new AdminPage(driver);
        adminPage.login(username, password);
    }
}

