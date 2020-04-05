import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LogIn extends TestBase {


    @Test
    public void LogIn() {
        driver.findElement(By.id("header-signin-link")).click();
        driver.findElement(By.id("login-username")).sendKeys("dolbo@yahoo.com" + Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("login-passwd")).click();
        driver.findElement(By.id("login-passwd")).clear();
        driver.findElement(By.id("login-passwd")).sendKeys("asdf" + Keys.ENTER);
    }
}