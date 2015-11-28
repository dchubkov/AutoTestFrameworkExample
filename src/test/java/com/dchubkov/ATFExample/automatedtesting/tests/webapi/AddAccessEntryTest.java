package com.dchubkov.ATFExample.automatedtesting.tests.webapi;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * Web UI test for
 */
public class AddAccessEntryTest {
    
    int testInt;

    @BeforeMethod
    public void setUp() {
        testInt = 0;
    }

    @Test (groups = { "Smoke", "WebUI" }, description = "Some smoke test", priority = 1)
    public void smokeTest() {
        testInt++;
        Assert.assertTrue(testInt == 1);
        System.out.println("smoke test passed");
    }
    
    @Test (groups = { "WebUI" }, description = "Some test", priority = 2)
    public void someTest() {
        testInt++;
        Assert.assertTrue(testInt == 2);
        System.out.println("some test passed");
    }
}