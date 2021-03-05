package Tests;

import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class AdminBaseTest extends BaseTest {

    private final static String adminPropertiesPath = "\\src\\main\\resources\\adminProperties";

    @BeforeSuite
    public static void setPropertiesPath() throws IOException {
        getAdminProperties(adminPropertiesPath);
    }
}
