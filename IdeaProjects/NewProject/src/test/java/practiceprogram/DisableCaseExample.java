package practiceprogram;

import jdk.jfr.Enabled;
import org.testng.annotations.*;

public class DisableCaseExample {

    @Test
    public static void executeTest(){
        System.out.println("Execute this");
    }

    @BeforeTest
    public static void beforeTest(){
        System.out.println("Check before test");
    }

    @AfterTest
    public static void afterTest(){
        System.out.println("Check after test");
    }
    @BeforeMethod
    public static void beforeMethod(){
        System.out.println("Before method");
    }
    @AfterMethod
    public static void afterMethod(){
        System.out.println("After method");
    }
    @Test
    public static void secondTest(){
        System.out.println("Second test");
    }
    @Test (enabled = false)
    public static void enabledFalse(){
        System.out.println("Enabled false");
    }
}
