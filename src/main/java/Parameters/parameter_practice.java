package Parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter_practice {

    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    @Test(priority = 1)
    public void setup(String browser,String app) {
       if (browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "C:\\Users\\maheshbabuy\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }
        else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\maheshbabuy\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        driver.get(app);

    }



    @Test(priority = 2)
    public void titleverify() {
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String exptitle = "OrangeHRM";
        String actualtitle = driver.getTitle();
        Assert.assertEquals(exptitle, actualtitle, "title matched");
    }

    @AfterClass
    @Test(priority = 3)
    public void close() {
        driver.quit();


    }
}
