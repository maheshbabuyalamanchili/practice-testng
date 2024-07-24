package Dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider_practice {

  @Test(dataProvider = "loign",dataProviderClass = dataprovider_class.class)
    public void logintest(String email,String password){
    System.out.println(email+" "+password);

    }



//   @DataProvider(name="login")
//    public Object[][]getdata(){
//        Object[][] data={{"abcd@gmail.com","abc"},{"1234@gmail.com","123"},{"xyz@gmail.com","xyz"}};
//            return data;
//    }
}
