package TestsBase;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class AdminBaseTest extends BaseTest {

    private final static String adminPropertiesPath = "\\src\\main\\resources\\adminProperties";

    @BeforeSuite
    public static void setPropertiesPath() throws IOException {
        getAdminProperties(adminPropertiesPath);
    }


}
