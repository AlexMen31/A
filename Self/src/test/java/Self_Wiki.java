import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Self_Wiki {
    WebDriver driver;

    @Test
    public void SearchWiki() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/");
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("Coronavirus" + Keys.ENTER);
        Thread.sleep(5000);
        driver.quit();
    }

}
