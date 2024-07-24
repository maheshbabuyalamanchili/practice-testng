package Dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//providing data from another class
public class dataprovider_class {

    @DataProvider(name = "login")
    public Object[][]getdata(){
        Object[][]data={{"abcd@gmail.com","abc"},{"1234@gmail.com","123"},{"xyz@gmail.com","xyz"}};
        return data;
    }

}


