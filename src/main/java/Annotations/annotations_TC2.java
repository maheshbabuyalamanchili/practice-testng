package Annotations;

import org.testng.annotations.*;

public class annotations_TC2 {
    @BeforeClass
    public void beforeclass(){
        System.out.println("excute before class");
    }

    @BeforeMethod
    public  void beforemethod(){
        System.out.println("excute before every method");
    }

    @Test(priority = 1)
    public  void test3(){
        System.out.println("test 3 method executed");
    }

    @Test(priority = 2)
    public  void test4(){
        System.out.println("test 4 method executed");
    }
    @AfterMethod
    public  void aftermethod(){
        System.out.println("excute after every method");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("excute after class");
    }
}
