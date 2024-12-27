package org.automation.base1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setup() {
        // Set up WebDriver, browser configuration, etc.
        System.out.println("Setup method - Browser initialization");
    }

    @AfterClass
    public void tearDown() {
        // Clean up resources, close WebDriver
        System.out.println("TearDown method - Close browser");
    }
}
