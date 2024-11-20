package testNGTask;

import org.testng.annotations.*;
import org.testng.annotations.Test;

@Test
public class TestAnnotations {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("Before Suit");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("After Suit");
    }
    @BeforeTest
    public void beforTest(){
        System.out.println("Before Test");
    }
    @Ignore
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }
    @Test(enabled = false)
    public void test(){
        System.out.println("Test");
    }
    @AfterMethod
    public void beforeMethod(){
        System.out.println("After Method1");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method2");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }
    @Test
    @Parameters("browser")
    public void test2(@Optional("edge") String param){
        System.out.println("Test2");
        System.out.println(param);
    }
    @Parameters("browser")
    @Test
    public void test3(@Optional("Chrome") String param){
        System.out.println("Test3");
        System.err.println(param);
    }

}

