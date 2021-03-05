package Tests;

import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class ClientBaseTest extends BaseTest {

    private final static String userPropertiesPath = "\\src\\main\\resources\\userProperties";

    @BeforeSuite
    public static void setPropertiesPath() throws IOException {
        getUserProperties(userPropertiesPath);
    }

}
