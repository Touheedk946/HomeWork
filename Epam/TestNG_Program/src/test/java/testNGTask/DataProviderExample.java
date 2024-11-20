package testNGTask;

import org.testng.annotations.DataProvider;

public class DataProviderExample {

    @DataProvider(name = "data")
    public Object[][] dpMethod() {
        Object[][] data = new Object[2][2];
        data[0][0] = 10;
        data[0][1] = 20;
        data[1][0] = 70;
        data[1][1] = -40;
        return data;
    }

    @DataProvider
    public Object[][] dpMethod2()
    {
        Object[][] data = new Object[2][2];
        data[0][0] = -9;
        data[0][1] = -8;
        data[1][0] = 0;
        data[1][1] = -40;
        return data;
    }


}

