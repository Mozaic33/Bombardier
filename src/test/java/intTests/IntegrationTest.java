package intTests;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.TestRunner;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

import static org.openqa.grid.common.SeleniumProtocol.Selenium;

@Category(IntegrationTest.class)

public class IntegrationTest {
    @Test

    public void TestTitle1() {

        File src = new File("/usr/bin/google-chrome");
        System.setProperty("webdriver.chrome.driver", src.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("http://192.168.11.87:8989/AMGrads");
        String title1 = driver.getTitle();
        Assert.assertTrue(title1.contains("MyApp"));


    }
}
