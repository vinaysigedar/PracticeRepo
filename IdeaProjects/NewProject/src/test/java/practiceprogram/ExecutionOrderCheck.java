package practiceprogram;

import org.testng.annotations.Test;

public class ExecutionOrderCheck {

    @Test(priority = -1)
    public static void selectBrowser() {
        System.out.println("Select the browser");
    }

    @Test(invocationCount = 4)
    public static void openBrowser() {
        System.out.println("Open the browser");
    }

    @Test
    public static void changeBrowser() {
        System.out.println("Change the browser");
    }
    @Test
    public static void anotherTest(){
        System.out.println("This is my another test");
    }
    @Test(priority = -2)
    public static void maintainBrowser() {
        System.out.println("Maintain the browser");
    }
}
