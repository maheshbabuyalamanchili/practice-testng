//package Testng_practice;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class Hard_Assertions {
//    @Test
//    public void testgithub(){
//        System.setProperty("webdriver.edge.driver","C:\\Users\\maheshbabuy\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
//        WebDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://github.com/login");
//      //  driver.get("https://www.google.com/");
//
//        //Title assertion
//        String actualtitle=driver.getTitle();
//        String expectedtitle="Sign in to GitHub";
//        Assert.assertEquals(actualtitle,expectedtitle,"title mismatch");
//
//        //Url assertion
//        String actualtitleurl=driver.getCurrentUrl();
//        String expectedtitleurl="https://github.com/loginnn";
//        Assert.assertEquals(actualtitle,expectedtitle,"url mismatch");
//
//        //Text assertion
//        String actualtext=driver.findElement(By.xpath("//input[@id='login_field']")).getAttribute("value");
//        String expectedtext="Sign in to GitHub";
//        Assert.assertEquals(actualtitle,expectedtitle,"username text mismatch");
//
//        //border assertion
//        String actualborder=driver.findElement(By.xpath("//input[@id='login_field']")).getCssValue("border");
//        String expectedborder="1px solid rgb(rgb(153, 170, 187)";
//        Assert.assertEquals(actualtitle,expectedtitle,"border mismatch");
//
//        //Error msg assertion
//        String actualerrormsg=driver.findElement(By.xpath("//div[@class='px-2']/div")).getText();
//        String expectederrormsg="Incorrect username or password.";
//        Assert.assertEquals(actualtitle,expectedtitle,"errormsg mismatch");
//
//    }
//}
