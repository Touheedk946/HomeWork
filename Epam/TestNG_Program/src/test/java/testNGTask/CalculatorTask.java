package testNGTask;



import utils.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CalculatorTask {

    public Calculator calculator;

    @BeforeSuite(alwaysRun = true)
    public void getCalculator()
    {
        this.calculator = new Calculator();
    }

    @AfterMethod(alwaysRun = true)
    public void endTest() {
        System.out.println("Test completed.");
    }

    @BeforeMethod(alwaysRun = true)
    public void startTest()
    {
        System.out.println("Running Test");
    }


    @Test(dependsOnGroups = "smoke", dataProvider = "data", dataProviderClass = DataProviderExample.class)
    public void sumOfNumbers(int a, int b)
    {
        System.out.println(calculator.sum(a, b));
        Assert.assertEquals(30, calculator.sum(a, b), "Addition of 2 numbers" );
    }
    @Test(groups = "smoke")
    public void square()
    {
        System.out.println(calculator.sqrt(0));
        Assert.assertEquals(calculator.sqrt(4), 2, "Square root of a number");
    }

    @Test(groups = "smoke")
    public void CheckPositivity()
    {
        System.out.println(calculator.isPositive(2));
        Assert.assertTrue(calculator.isPositive(4));
    }

    @Test(groups = "smoke")
    public void CheckNegativity()
    {
        System.out.println(calculator.isNegative(-4));
        Assert.assertTrue(calculator.isNegative(-4));
    }

    @Test
    public void sinOfNumber()
    {
        System.out.println(calculator.sin(200));
        Assert.assertTrue(calculator.sin(200)<0);
    }

    @Test
    public void division()
    {
        try{
            calculator.div(10, 0);
        }
        catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void testDivByZeroWithDouble() {
        Assert.assertTrue(Double.isInfinite(calculator.div(10.0, 0.0)) );
    }

    @Test(dataProvider = "dpMethod2", dataProviderClass = DataProviderExample.class)
    public void subOfNegativeNumbers(long a, long b)
    {
        System.out.println(calculator.sub(a, b));
    }

    @Test(groups = "sanity")
    public void testIsPositiveWithZero() {
        System.out.println(calculator.isPositive(0L));
        Assert.assertFalse(calculator.isPositive(0L));
    }

    @Test(groups = "sanity")
    public void testIsNegativeWithZero() {
        System.out.println(calculator.isNegative(0L));
        Assert.assertFalse(calculator.isNegative(0L));
    }

}


