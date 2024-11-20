package example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegressionTest {

    @Test(groups = "regression")
    public void testAdvancedSearch() {
        System.out.println("Executing Regression Test: Advanced Search");
        Assert.assertTrue(true);
    }

    @Test(groups = "regression")
    public void testUserSettings() {
        System.out.println("Executing Regression Test: User Settings");
        Assert.assertEquals("Settings", "Settings");
    }
}
