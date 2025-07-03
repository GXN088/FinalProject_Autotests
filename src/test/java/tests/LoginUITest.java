package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUITest {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void testLogin() {
        driver.get("https://example.com/login");
        driver.findElement(By.id("username")).sendKeys("demo");
        driver.findElement(By.id("password")).sendKeys("demo123");
        driver.findElement(By.id("login")).click();
        Assertions.assertTrue(driver.findElement(By.id("logout")).isDisplayed());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
