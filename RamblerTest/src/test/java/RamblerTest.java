import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RamblerTest {
    WebDriver driver;

    @Test
    public void RamblerTest(){
    driver = new ChromeDriver();
    driver.get("https://www.rambler.ru/");
    driver.findElement(By.name("query")).click();
    driver.findElement(By.name("query")).clear();
    driver.findElement(By.name("query")).sendKeys("www" + Keys.ENTER);



    }
}
