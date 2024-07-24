package Listners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(I_Listenerclass.class)
 public class Test_class {
@Test(priority = 1)
    public void testone(){
        System.out.println("test 1");
    }

@Test(priority = 2)
    public void testtwo(){
        System.out.println("test 2");
    //Assert.assertTrue(false);
    }

@Test(priority = 3,dependsOnMethods = {"testtwo"})
    public void testthree(){
        System.out.println("test 3");
    }

@Test(priority = 4)
    public void testfour(){
        System.out.println("test 4");
    }
}
