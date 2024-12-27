package com.example.calculator;

import org.testng.Assert;
import org.testng.annotations.*;
import com.example.Calculator;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite: Initializing resources for the suite.");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite: Cleaning up resources for the suite.");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test: Setting up preconditions for the test.");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test: Cleaning up after the test.");
    }

    @BeforeClass
    public void setUpClass() {
        System.out.println("Before Class: Setting up class resources.");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("After Class: Cleaning up class resources.");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method: Setting up method resources.");
        calculator = new Calculator();
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method: Cleaning up method resources.");
    }

    // Positive Test Cases
    @Test(groups = {"positive"})
    public void testAddPositive() {
        Assert.assertEquals(calculator.add(2, 3), 5);
    }

    @Test(groups = {"positive"})
    public void testSubtractPositive() {
        Assert.assertEquals(calculator.subtract(5, 3), 2);
    }

    @Test(groups = {"positive"})
    public void testMultiplyPositive() {
        Assert.assertEquals(calculator.multiply(2, 3), 6);
    }

    @Test(groups = {"positive"})
    public void testDividePositive() {
        Assert.assertEquals(calculator.divide(6, 3), 2);
    }

    @Test(groups = {"positive"}, dependsOnMethods = {"testAddPositive"})
    public void testChainedPositive() {
        Assert.assertTrue(calculator.add(1, 2) < calculator.add(2, 2));
    }

    // Negative Test Cases
    @Test(groups = {"negative"})
    public void testAddNegative() {
        Assert.assertNotEquals(calculator.add(2, 3), 6);
    }

    @Test(groups = {"negative"})
    public void testSubtractNegative() {
        Assert.assertNotEquals(calculator.subtract(5, 3), 1);
    }

    @Test(groups = {"negative"}, expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(5, 0);
    }

    @Test(groups = {"negative"})
    public void testMultiplyNegative() {
        Assert.assertNotEquals(calculator.multiply(2, 3), 7);
    }

    @Test(groups = {"negative"}, dependsOnGroups = {"positive"})
    public void testChainedNegative() {
        Assert.assertFalse(calculator.add(1, 1) > calculator.add(2, 2));
    }

    // Data Provider Test
    @Test(dataProvider = "dataForAdd", groups = {"parameterized"})
    public void testAddWithDataProvider(int a, int b, int expected) {
        Assert.assertEquals(calculator.add(a, b), expected);
    }

    @DataProvider
    public Object[][] dataForAdd() {
        return new Object[][]{
                {1, 1, 2},
                {2, 3, 5},
                {10, 5, 15},
                {7, 8, 15},
                {-1, -1, -2}
        };
    }

    // Additional Test: Timeout
    @Test(timeOut = 1000)
    public void testLongRunningOperation() {
        // Simulating a long-running operation
        Assert.assertTrue(calculator.multiply(10, 20) == 200);
    }

    // Additional Test: Skip
    @Test(enabled = false)
    public void testSkipped() {
        // This test will be skipped
        Assert.fail("This test should not run.");
    }
}
