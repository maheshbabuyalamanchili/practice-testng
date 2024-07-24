package Priority;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority_practice {
    @Test(priority = 1)
    public void testone(){
        System.out.println("test 1");
    }

@Test(priority = 2)
    public void testtwo(){
        System.out.println("test 2");
    }

@Test(priority = 3)
    public void testthree(){
        System.out.println("test 3");
    }

@Test(priority = 4)
    public void testfour(){
        System.out.println("test 4");
    }


}
