package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertions_practice {
    WebDriver driver;

    @BeforeClass
    @Test
    public void browserlaunch() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\maheshbabuy\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
         driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

        @Test
        public  void verify_title(){
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            String exptitle="OrangeHRM";
            String actualtitle = driver.getTitle();
            Assert.assertEquals(exptitle,actualtitle,"title matched");
        }

        @AfterClass
        @Test
        public  void close(){
        driver.quit();
    }
}
