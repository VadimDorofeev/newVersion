package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static String getCurrentTimestamp() {
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss-SSS");
        String timestampString = dateFormat.format(timestamp);
        return timestampString;
    }

    public static void takeScreenshot(WebDriver driver) throws IOException {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./Screenshots/screenshot"
                    + Utils.getCurrentTimestamp() + ".png"));
        } catch (Exception e) {
            System.out.println("Exception while taking screenshoot " + e.getMessage());
        }
    }
}
