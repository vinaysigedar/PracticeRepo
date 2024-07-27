package practiceprogram;

import org.testng.annotations.*;

public class AnnotationExecutionOrder {

    @Test
    public static void firstTest(){
        System.out.println("This is my first test");
    }
    @BeforeSuite
    public static void beforeSuiteMethod(){
        System.out.println("This is my before suite method");
    }
    @Test
    public static void secondTest(){
        System.out.println("This is my second test");
    }
    @BeforeClass
    public static void beforeClassMethod(){
        System.out.println("This is my before class method");
    }
    @BeforeMethod
    public static void beforeMethodTest(){
        System.out.println("This is my before method test");
    }
    @BeforeTest
    public static void beforeTestMethod(){
        System.out.println("This is my before test method");
    }
    @AfterSuite
    public static void afterSuiteMethod(){
        System.out.println("This is my after suite method");
    }
    @AfterClass
    public static void afterClassMethod(){
        System.out.println("This is my after class method");
    }
    @AfterTest
    public static void afterTestMethod(){
        System.out.println("This is my after test method");
    }
    @AfterMethod
    public static void afterMethod1(){
        System.out.println("This is my first after method block");
    }
    @Test
    public static void anotherTest(){
        System.out.println("This is my another test");
    }
}
