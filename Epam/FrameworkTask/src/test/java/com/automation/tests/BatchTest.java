package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BatchTest  {

    @Test
    public void testBatch1() {
        System.out.println("Batch Test 1");
        Assert.assertTrue(true);
    }

    @Test
    public void testBatch2() {
        System.out.println("Batch Test 2");
        Assert.assertTrue(true);
    }
}
