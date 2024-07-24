package Parllel_Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class parallel_testing1methods {
    WebDriver driver;

    @Test
    public void homepagetitleEDGE() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String expectedtitle = "OrangeHRM";
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, expectedtitle);
        Thread.sleep(3000);
    }

    @Test
    public void homepagetitleFirefox() throws InterruptedException {
       //System.setProperty("webdriver.chrome.driver", "C:\\Users\\maheshbabuy\\Desktop\\chromedriver.exe");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String expectedtitle = "OrangeHRM";
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, expectedtitle);
        Thread.sleep(3000);
    }

    @Test
    public void homepagetitleFIREFOX() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String expectedtitle = "OrangeHRM";
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, expectedtitle);
        Thread.sleep(3000);
    }


    @AfterMethod
    public void teardown() {
        driver.quit();

    }
}
