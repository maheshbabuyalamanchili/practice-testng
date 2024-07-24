package Groups;

import org.testng.annotations.Test;

public class groups {
    @Test(groups = {"sanity"})
    public void a() {
        System.out.println("exe snt");
    }

    @Test(groups = {"sanity"})
    public void b() {
        System.out.println("exe snt");
    }

    @Test(groups = {"regression"})
    public void c() {
        System.out.println("exe reg");
    }

    @Test(groups = {"regression"})
    public void d() {
        System.out.println("exe reg");
    }

    @Test(groups = {"sanity", "regression"})
    public void e() {
        System.out.println("exe snt reg");
    }
}



