import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Repete {
    WebDriver driver;

  //  public void OpenG(){

  //  }

    @Test
    public void Test() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.yahoo.com/");
        driver.findElement(By.name("p")).click();
        driver.findElement(By.name("p")).clear();
        driver.findElement(By.name("p")).sendKeys("Dolboiob" + Keys.ENTER);
        Thread.sleep(5000);
        driver.quit();
    }
}
