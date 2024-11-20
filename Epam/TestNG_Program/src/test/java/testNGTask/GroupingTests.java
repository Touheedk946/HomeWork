package testNGTask;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupingTests {
    @Test(groups = "smoke")
    public void test1(){System.out.println("test1");}
    @Test(groups = "regression")
    public void test2(){ System.out.println("test2");}
    @Test(groups = "sanity")
    public void test3(){ System.out.println("test3");}
    @Test(groups = {"sanity", "regression"})
    public void test4(){ System.out.println("test4");}
    @Test(groups = {"regression", "smoke"})
    public void test5(){ System.out.println("test5");}
    @Test(groups = "functional")
    public void test6(){ System.out.println("test6");}
    @Test(groups = "functional")
    public void test7(){ System.out.println("test7");}
    @BeforeSuite
    public void test8(){ System.out.println("test8");}
    @BeforeClass
    public void test9(){ System.out.println("test9");}
}

