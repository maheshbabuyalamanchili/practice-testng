package Testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testclass2{
    WebDriver driver;

    @Test(priority = 1)
    public void launch_browser(){
         driver= new EdgeDriver();
         driver.manage().window().maximize();
    }

    @Test(priority = 2)
    public void open_application(){
       driver.get("http://admin-demo.nopcommerce.com/login");
    }

    @Test(priority = 3)
    public void logindetails() throws InterruptedException {
        //driver.findElement(By.xpath("//input[@id='Email']")).clear();
        //driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
        WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
        String emailtxt= email.getAttribute("value");
        Thread.sleep(3000);

        //driver.findElement(By.xpath("//input[@id='Password']")).clear();
        //driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("//input[@id='admin']");
        WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
        String passwordtxt= password.getAttribute("vallue");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }

    @Test(priority = 4)
    public void closebrower(){
        driver.quit();
    }

}
