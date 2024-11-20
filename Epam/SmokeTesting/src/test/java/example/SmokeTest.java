package example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest {

    @Test(groups = "smoke")
    public void testLogin() {
        System.out.println("Executing Smoke Test: Login");
        Assert.assertTrue(true);
    }

    @Test(groups = "smoke")
    public void testHomePageLoad() {
        System.out.println("Executing Smoke Test: HomePage");
        Assert.assertEquals("Home", "Home");
    }
}

