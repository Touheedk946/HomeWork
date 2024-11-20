package testNGTask;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class Listerner implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("OnStart method of ITestNGListener");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("OnFinish method of ITestNGListener");
    }
}
