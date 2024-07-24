
package Disable;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Disable_practice_and_Ignore {

        @Ignore
        @Test(priority = 1)
        public void testone(){
            System.out.println("test 1");
        }


        @Test(priority = 2,enabled = false)
        public void testtwo(){
            System.out.println("test 2");
        }



        @Test(priority = 3)
        public void testthree(){
            System.out.println("test 3");
        }

        @Test(priority = 4,enabled = false)
        public void testfour(){
            System.out.println("test 4");
        }



    }


