package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTest {

    @Test(groups = {"smoke"})
    public void testLogin() {
        System.out.println("Testing login functionality");
        Assert.assertTrue(true);
    }

    @Test(groups = {"regression"}, dependsOnGroups = "smoke")
    public void testDashboardAccess() {
        System.out.println("Testing dashboard access after login");
        Assert.assertTrue(true);
    }

    @Test(dataProvider = "testData")
    public void testCalculation(int a, int b, int expected) {
        System.out.println("Testing calculation: " + a + " + " + b);
        Assert.assertEquals(a + b, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] provideData() {
        return new Object[][] {
                { 1, 2, 3 },
                { 4, 5, 9 }
        };
    }
}
