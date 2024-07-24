package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
    WebDriver driver;
    @Test
    public void ASSERTION1() {
        System.setProperty("WebDriver.edge.driver", "C:\\Users\\maheshbabuy\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("hyr tutorials", Keys.ENTER);
        String expectedtitle = "hyr tutorials - Google Search";
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, expectedtitle, "title is matched");
        driver.quit();
    }

        @Test
        public void ASSERTION2()  {
            WebDriver driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.selenium.dev/");
            driver.findElement(By.xpath("//span[text()='Downloads']")).click();
            String expectedtitl="Downloads | Selenium";
            String actualtitl=driver.getTitle();
            Assert.assertEquals(actualtitl,expectedtitl,"title is matched");
            driver.quit();

        }



    }


