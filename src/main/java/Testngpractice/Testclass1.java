package Testngpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testclass1 {
@Test

    public void testhyrtutorials() throws InterruptedException {
        System.setProperty("WebDriver.edge.driver", "C:\\Users\\maheshbabuy\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("hyr tutorials",Keys.ENTER);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void testselenium() throws InterruptedException {
        System.setProperty("WebDriver.edge.driver", "C:\\Users\\maheshbabuy\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
        driver.findElement(By.xpath("//span[text()='Downloads']")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }
    }




