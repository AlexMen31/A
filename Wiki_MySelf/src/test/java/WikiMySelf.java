import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.sql.Driver;

public class WikiMySelf {
    WebDriver driver;

    @Test
    public void Open_Wiki() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/");
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("C++" + Keys.ENTER);
        Thread.sleep(3000);
        driver.quit();



    }
}
