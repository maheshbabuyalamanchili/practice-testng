package Annotations;

import org.testng.annotations.*;

public class annotaions_TC1 {


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("excute before suite");
    }

    @BeforeTest
    public void beforetest(){
        System.out.println("excute before test");
    }

    @BeforeClass
    public void beforeclass(){
        System.out.println("excute before class");
    }

    @BeforeMethod
    public  void beforemethod(){
        System.out.println("excute before every method");
    }

    @Test(priority = 1)
    public  void test1(){
        System.out.println("test 1 method executed");
    }

    @Test(priority = 2)
        public  void test2(){
            System.out.println("test 2 method executed");
        }
    @AfterMethod
    public  void aftermethod(){
        System.out.println("excute after every method");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("excute after class");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("excute after test");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("excute After suite");
    }

}
