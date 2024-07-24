package Groups;

import org.testng.annotations.Test;

public class Groups_practice {

    @Test(groups = {"smoke"})
    public void test1(){
        System.out.println("exe smoke");
    }

    @Test(groups = {"smoke"})
    public void test2(){
        System.out.println("exe smoke");
    }

    @Test(groups = {"regression"})
    public void test3(){
        System.out.println("exe regression");
    }

    @Test(groups = {"regression"})
    public void test4(){
        System.out.println("exe regression");
    }

    @Test(groups = {"smoke","regression"})
    public void test5(){
        System.out.println("exe smoke & regression");
    }
}
