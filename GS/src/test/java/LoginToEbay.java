import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LoginToEbay extends TestBase {
    @Test
    public void LogInTest(){
        driver.get("https://www.ebay.com/");

        driver.findElement(By.id("gh-ug")).click();
        driver.findElement(By.name("userid")).click();
        driver.findElement(By.name("userid")).clear();
        driver.findElement(By.name("userid")).sendKeys("alexme.men@gmail.com" + Keys.TAB);
    }


}
