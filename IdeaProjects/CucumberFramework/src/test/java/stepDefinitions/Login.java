package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
    public WebDriver driver;
    public WebDriverWait wait;

    @Given("user is on orange hrm login page")
    public void user_is_on_orange_hrm_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Given("user enters username as {string}")
    public void user_enters_username_as(String username) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name=\'username\']")));
        driver.findElement(By.xpath("//input[@name=\'username\']")).sendKeys(username);
    }

    @Given("user enters password as {string}")
    public void user_enters_password_as(String password) {
        driver.findElement(By.xpath("//input[@name=\'password\']")).sendKeys(password);
    }

    @Given("user clicks on login button")
    public void user_clicks_on_login_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()=' Login ']")));
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
    }

    @Then("user should be able to land on home page")
    public void user_should_be_able_to_land_on_home_page() {
        String title = driver.getTitle();
        System.out.println("Logged in successfully" + title);
    }
}