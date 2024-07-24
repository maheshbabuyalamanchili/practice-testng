package Dependency_Alwaysrun;

import org.testng.annotations.Test;

//DEPENDENCY & ALWAYS RUN

public class Dependency_practice {

    @Test(priority = 1)
    public void stcr(){
        System.out.println("stcr1");
    }

@Test(priority =2,dependsOnMethods = {"stcr"})
    public void drcr(){
        System.out.println("drcr2");
    }

@Test(priority = 3,dependsOnMethods = {"drcr"})
    public void stpcr(){
        System.out.println("stpcr3");
    }

@Test(priority = 4)
public void prcr(){
        System.out.println("prcr4");
    }


}
